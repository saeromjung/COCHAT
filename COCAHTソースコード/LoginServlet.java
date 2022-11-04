package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import newpackage.ConnectionPro;
import newpackage.User;
import newpackage.UserDatabase;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {

       
   

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet LoginServlet</title>");
			out.println("</head>");
			out.println("<body>");
			
			String lEmail = request.getParameter("email");
			String lPass = request.getParameter("password");
			
			UserDatabase db = new UserDatabase(ConnectionPro.getConnection());
			User user = db.logUser(lEmail, lPass);
			if(user!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("loguser",user);
				response.sendRedirect("welcone.jsp");
			}else {
				out.print("user not found");
				
			}
			
			out.println("</body>");
			out.println("</html>");
			
		}
	}

}
