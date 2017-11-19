package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

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

	public int getNumOfContacts(String username) {
		int numberOfContacts = 0;
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("SELECT * FROM phonebook.contacts WHERE username=?;");

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				numberOfContacts++;
			}

			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return numberOfContacts;
	}

	@Override
	public List<Contact> searchContact(String contactInfo, String username) {
		List<Contact> contacts = new LinkedList<>();
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("SELECT * FROM phonebook.contacts WHERE username=? AND name LIKE ?;");

			pstmt.setString(1, username);
			pstmt.setString(2, contactInfo + "%");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Contact contact = new Contact(rs.getString("name"), rs.getString("lastName"), rs.getString("email"),
						rs.getString("phone"), rs.getString("city"), rs.getInt("id"));
				contact.setDate(rs.getString("date"));

				contacts.add(contact);

			}
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return contacts;
	}

	public boolean deleteContact(int id) {
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("DELETE phonebook.contacts FROM phonebook.contacts WHERE id=?;");

			pstmt.setInt(1, id);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

			return false;
		}
	}

	public Contact getContactById(int id) {
		Contact contact = new Contact();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM phonebook.contacts WHERE id=? ;");

			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			rs.next();
			contact = new Contact(rs.getString("name"), rs.getString("lastName"), rs.getString("email"),
					rs.getString("phone"), rs.getString("city"), id);

			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return contact;
	}

	public boolean editContact(Contact contact, int id) {
		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE phonebook.contacts SET name=?,lastName=?,email=?,phone=?,city=? WHERE id=?;");

			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getLastName());
			pstmt.setString(3, contact.getEmail());
			pstmt.setString(4, contact.getPhone());
			pstmt.setString(5, contact.getCity());
			pstmt.setInt(6, id);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {

			return false;
		}
	}

	@Override
	public List<Contact> listAllContacts(String username) {

		List<Contact> contacts = new LinkedList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM phonebook.contacts WHERE username=? ;");

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Contact contact = new Contact(rs.getString("name"), rs.getString("lastName"), rs.getString("email"),
						rs.getString("phone"), rs.getString("city"));
				contact.setDate(rs.getString("date"));
				contacts.add(contact);

			}
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return contacts;
	}

}
