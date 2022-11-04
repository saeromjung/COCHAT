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
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
      
    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {

			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet RegisterServlet</title>");
			out.println("</head>");
			out.println("<body>");

			//  新規登録ページからの情報
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			// ユーザーオブジェクトを作る
			User userModel = new User(name, email, password);

			UserDatabase regUser = new UserDatabase(ConnectionPro.getConnection());
			if (regUser.saveUser(userModel)) {
				response.sendRedirect("index.jsp");
			} else {
				String errorMessage = "User Available";
				HttpSession regSession = request.getSession();
				regSession.setAttribute("RegError", errorMessage);
				response.sendRedirect("registration.jsp");
			}

			out.println("</body>");
			out.println("</html>");
		}
	}
}