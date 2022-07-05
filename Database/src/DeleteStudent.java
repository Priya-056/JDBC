import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
			PreparedStatement ps=con.prepareStatement("DELETE FROM student where s_id=2003");
			int rs=ps.executeUpdate();
			System.out.println(rs);			
			if (rs==1) {
			System.out.println("Updated successfully");
			}
			else {
				System.out.println("Updation failed");
			}
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
