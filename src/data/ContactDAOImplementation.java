package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Contact;

public class ContactDAOImplementation implements ContactDAO {
	Connection conn = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean addContact(Contact contact, String username) {

		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO phonebook.contacts (name,lastName,email,phone,city,date,username) VALUES (?,?,?,?,?,?,?);");

			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getLastName());
			pstmt.setString(3, contact.getEmail());
			pstmt.setString(4, contact.getPhone());
			pstmt.setString(5, contact.getCity());
			pstmt.setString(6, contact.getDate());
			pstmt.setString(7, username);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

			return false;
		}

	}

	@Override
	public boolean searchContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

}
