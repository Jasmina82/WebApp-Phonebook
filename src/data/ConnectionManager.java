package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static ConnectionManager instance = null;

	private static final String USERNAME = "root";
	private static final String PASSWORD = "toor";

	private static final String CONN_STRING = "jdbc:mysql://localhost/phonebook?useSSL=false";

	private Connection connection = null;

	private ConnectionManager() {

	}

	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	private boolean openConnection() {
		try {
			
			// load and register JDBC driver for MySQL
					
						Class.forName("com.mysql.jdbc.Driver"); 
						
			
			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			
		}
		catch(ClassNotFoundException e) {
			
		}
		return false;
	}

	public Connection getConnection() {
		if (connection == null) {
			if (openConnection()) {
				return connection;
			} else {
				return null;
			}
		}
		return connection;
	}

	public void close() {

		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
		}
	}
}
