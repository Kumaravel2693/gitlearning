package org.icici;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load Driver

		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2.set the connection

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Kumar@2693");

		// 3.querry

		String querry = "select * from Employees";

		// 4.prepare the statement

		PreparedStatement prepareStatement = connection.prepareStatement(querry);

		// 5.excute querry
		ResultSet executeQuery = prepareStatement.executeQuery();

		// 6.iterate result

		while (executeQuery.next()) {
			int int1 = executeQuery.getInt("employee_id");
			System.out.println(int1);

			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}

	}

}
