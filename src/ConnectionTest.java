
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String args[]) throws ReflectiveOperationException, SQLException{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","myproject","myproject");  
		  Statement stmt=con.createStatement();

		  ResultSet rs=stmt.executeQuery("select * from emp");  
		  while(rs.next())  
		  System.out.println(rs.getInt(1)+"  "+rs.getInt(1));  
		    
		  //step5 close the connection object  
		  con.close();
		//step5 close the connection object  
		con.close();  
}
}