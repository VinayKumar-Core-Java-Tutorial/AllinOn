package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDao {
	 public UserParam checkLogin(String email, String password) throws SQLException,
     ClassNotFoundException {


		 Class.forName("oracle.jdbc.driver.OracleDriver");  
    Connection     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root"); 
 String sql = "SELECT * FROM users WHERE uemail = ? and upwd = ?";
 PreparedStatement statement = con.prepareStatement(sql);
 statement.setString(1, email);
 statement.setString(2, password);

 ResultSet result = statement.executeQuery();

 UserParam user = null;

 if (result.next()) {
     user = new UserParam();
     user.setUname(result.getString("uname"));
     user.setUemail(email);
 }

 con.close();

 return user;
}
}