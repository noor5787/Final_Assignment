import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydatabase"; // MySQL database URL
		String username = "root"; // MySQL username
		String password = "root123"; // MySQL password

		String query = "SELECT * FROM students"; // table name

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {

			// Iterate over the result set and display data
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");

				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
