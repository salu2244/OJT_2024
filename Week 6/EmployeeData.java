package jdbc;

/**
 *
 * @author IBMUSER
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeData {
    private static final String URL = "jdbc:mysql://localhost:3307/Shikha";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // Create multiple records
            createRecord(connection, 1, "John", "Doe", "john.doe@example.com", "2023-06-01");
            createRecord(connection, 2, "Susma", "Singh", "sus.sin@example.com", "2023-07-01");
            createRecord(connection, 3, "Robert", "Smith", "robert.smith@example.com", "2023-08-01");
            createRecord(connection, 4, "Emily", "Johnson", "emily.johnson@example.com", "2023-09-01");
            createRecord(connection, 5, "Michael", "Brown", "michael.brown@example.com", "2023-10-01");

            // Read Records
            readRecords(connection);

            // Update multiple records
            updateRecord(connection, 1, "john.doe@company.com");
            updateRecord(connection, 2, "sus.sin@company.com");

            // Delete multiple records
            deleteRecord(connection, 1);
            deleteRecord(connection, 2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new Record
    public static void createRecord(Connection connection, int employeeID, String firstName, String lastName, String email, String hireDate) throws SQLException {
        String insertSQL = "INSERT INTO Employees (EmployeeID, FirstName, LastName, Email, HireDate) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setInt(1, employeeID);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, hireDate);
            preparedStatement.executeUpdate();
            System.out.println("Record Created Successfully: EmployeeID = " + employeeID);
        }
    }

    // Read Records from the Database
    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Employees";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int employeeID = resultSet.getInt("EmployeeID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                String hireDate = resultSet.getString("HireDate");

                System.out.println("EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName + ", Email: " + email + ", HireDate: " + hireDate);
            }
        }
    }

    // Update Record
    private static void updateRecord(Connection connection, int employeeID, String email) throws SQLException {
        String updateSQL = "UPDATE Employees SET Email = ? WHERE EmployeeID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, employeeID);
            preparedStatement.executeUpdate();
            System.out.println("Record Updated Successfully: EmployeeID = " + employeeID);
        }
    }

    // Delete Record
    private static void deleteRecord(Connection connection, int employeeID) throws SQLException {
        String deleteSQL = "DELETE FROM Employees WHERE EmployeeID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, employeeID);
            preparedStatement.executeUpdate();
            System.out.println("Record Deleted Successfully: EmployeeID = " + employeeID);
        }
    }
}
