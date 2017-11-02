package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
