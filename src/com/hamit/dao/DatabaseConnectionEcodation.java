package com.hamit.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionEcodation {

	private String url = "jdbc:mysql://localhost:3306/hastane_otomasyonu";
	private String user = "root";
	private String password = "root";

	public Connection getConnectionDb() {
		Connection connection = null;
		try {
			if (connection == null || connection.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				// System.out.println("Driver ba�ar�l� bir �ekilde y�klendi...");
				connection = DriverManager.getConnection(url, user, password);
				// System.out.println("Ba�lant� ba�ar�l�...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		// DatabaseConnectionEcodation baglanti = new DatabaseConnectionEcodation();
		// baglanti.getConnectionDb();
	}
}
