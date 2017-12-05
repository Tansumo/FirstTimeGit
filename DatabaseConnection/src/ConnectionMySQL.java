import java.sql.*;

public class ConnectionMySQL {
	public static void main(String[]args){
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/customer","root","Tanbankeiei09");
			
			System.out.println("System login success");
			
			String query = "SELECT * FROM customer" ;
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println("ID:"+rs.getString("id")+" Firstname:"+rs.getString("first_name")+" Lastname:"+rs.getString("last_name")+" Tel:"+rs.getString("tel"));
			}
			
			
		}catch (Exception e){
			System.err.println(e);
		}
		
			
	}

}
