package newpackage;
import java.sql.*;

public class UserDatabase {
    Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //�V�K�o�^���[�U�[ 
    public boolean saveUser(User user){
        boolean set = false;
        try{
            //�o�^�����f�[�^���@�f�[�^�x�[�X�֑���
            String query = "insert into user(name,email,password) values(?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user.getName());
           pt.setString(2, user.getEmail());
           pt.setString(3, user.getPassword());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    //���[�U�[���O�C��
    public User logUser(String email, String pass) {
    	User user = null;
    	try {
    		
    		String query = "select * from user where email=? and password=?";
    		PreparedStatement pst =this.con.prepareStatement(query);
    		pst.setString(1, email);
    		pst.setString(2, pass);
    		
    		ResultSet rs = pst.executeQuery();
    		if(rs.next()) {
    			user = new User();
    			user.setId(rs.getInt("id"));
    			user.setName(rs.getString("name"));
    			user.setEmail(rs.getString("email"));
    			user.setPassword(rs.getString("password"));
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return user;
		
    }
}

