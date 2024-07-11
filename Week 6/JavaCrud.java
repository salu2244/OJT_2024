
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IBMUSER
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaCrud {
    private static final String URL = "jdbc:mysql://localhost:3307/IBMEmployeeData";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // Create a record
            createRecord(connection, "Shikha_Kumari", "shikha@123gmail.com");

            // Read Records
            readRecords(connection);

            // Update
            updateRecord(connection, 1, "Manjima_Bhatacharya", "manjima@gmail.com");

            // Delete Operation
            deleteRecord(connection, 1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new Record
    public static void createRecord(Connection connection, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
            System.out.println("Record Created Successfully");
        }
    }

    // Read Records from the Database
    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("id: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }

    // Update Record
    private static void updateRecord(Connection connection, int id, String name, String email) throws SQLException {
        String updateSQL = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
            System.out.println("Record Updated Successfully");
        }
    }

    // Delete Record
    private static void deleteRecord(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Record Deleted Successfully");
        }
    }
}
