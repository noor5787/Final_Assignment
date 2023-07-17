import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDApplication {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase"; // MySQL database
																					// URL
	private static final String USERNAME = "root"; // MySQL username
	private static final String PASSWORD = "root123"; // MySQL password

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("CRUD Application");
			System.out.println("----------------");
			System.out.println("1. Add record");
			System.out.println("2. View records");
			System.out.println("3. Update record");
			System.out.println("4. Delete record");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addRecord();
				break;
			case 2:
				viewRecords();
				break;
			case 3:
				updateRecord();
				break;
			case 4:
				deleteRecord();
				break;
			case 5:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void addRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Add Record");
		System.out.println("----------");

		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		System.out.print("Enter age: ");
		int age = scanner.nextInt();

		try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO mytable (name, age) VALUES (?, ?)")) {

			statement.setString(1, name);
			statement.setInt(2, age);

			int rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("Record added successfully.");
			} else {
				System.out.println("Failed to add record.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewRecords() {
		System.out.println("View Records");
		System.out.println("------------");

		try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable")) {

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

	private static void updateRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Update Record");
		System.out.println("-------------");

		System.out.print("Enter the ID of the record to update: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.print("Enter new name: ");
		String newName = scanner.nextLine();

		System.out.print("Enter new age: ");
		int newAge = scanner.nextInt();

		try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				PreparedStatement statement = connection
						.prepareStatement("UPDATE mytable SET name = ?, age = ? WHERE id = ?")) {

			statement.setString(1, newName);
			statement.setInt(2, newAge);
			statement.setInt(3, id);

			int rowsUpdated = statement.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Record updated successfully.");
			} else {
				System.out.println("Failed to update record. Please check the ID.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Delete Record");
		System.out.println("-------------");

		System.out.print("Enter the ID of the record to delete: ");
		int id = scanner.nextInt();

		try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				PreparedStatement statement = connection.prepareStatement("DELETE FROM mytable WHERE id = ?")) {

			statement.setInt(1, id);

			int rowsDeleted = statement.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Record deleted successfully.");
			} else {
				System.out.println("Failed to delete record. Please check the ID.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
