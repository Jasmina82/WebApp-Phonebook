package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;

public class UserDAOImplementation implements UserDAO {

	Connection conn = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean userExist(String username) {
		int countUsers = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT username FROM phonebook.users WHERE username=?;");
			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				countUsers++;
			}
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return countUsers != 0;
	}

	@Override
	public boolean validPassword(String username, String password) {

		boolean passwordsMatch = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT password FROM phonebook.users WHERE username=?;");
			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String passwordFromDatabase = rs.getString("password");
			passwordsMatch = passwordFromDatabase.equals(password);
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return passwordsMatch;
	}

	@Override
	public boolean addUser(User user) {
		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO phonebook.users (username,name,lastName,email,city,password) VALUES (?,?,?,?,?,?);");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getLastName());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getCity());
			pstmt.setString(6, user.getPassword());
			

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

			return false;
		}
	}

}
