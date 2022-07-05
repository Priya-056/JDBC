import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
			PreparedStatement ps=con.prepareStatement("update student set s_name=(?) where s_id=(?)");
			ps.setString(1, "Roshini");
			ps.setInt(2, 2002);
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
