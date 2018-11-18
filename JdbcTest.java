
import java.sql.*;
//import com.mysql.jdbc.Driver;
class JdbcTest{
	
	public static void main(String[] args){
		try{
	//		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myusers","root","");
		Statement 	stmnt = con.createStatement();
		ResultSet result = stmnt.executeQuery("select * from users");
		while(result.next()){

			System.out.println("Name:"+ result.getString("username"));

		}

	}
	catch(Exception e){

		System.out.println(e);

	}


	}
}
