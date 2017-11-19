package beans;

import java.text.DateFormat;

public class Contact {

	String phone;
	String name;
	String lastName;
	String email;
	String city;
	String message;
	java.util.Date realDate;
	String date;
	int id;

	public Contact() {
		realDate = new java.util.Date();
		date = DateFormat.getDateInstance().format(realDate);
	}

	public Contact(String name, String lastName, String email, String phone, String city) {

		this.phone = phone;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		realDate = new java.util.Date();
		date = DateFormat.getDateInstance().format(realDate);

	}

	public Contact(String name, String lastName, String email, String phone, String city, int id) {

		this.phone = phone;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.id = id;

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public boolean validate() {

		if (!email.matches("\\w+@\\w+\\.\\w+")) {
			message = "Invalid email";
			return false;
		}
		// 00 38762 123 123; +38735 717 171;
		String pattern1 = "0?0?[\\s-]?\\(?(\\d{5})?\\)?[\\s-]?\\d{3}[\\s-]?\\d{3}";
		// 061 111 111; 717 717
		String pattern2 = "(\\d{3})?[\\s-]?\\d{3}[\\s-]?\\d{3}";
		if (!phone.matches(pattern1) && !phone.matches(pattern2)) {
			message = "Invalid phone number";
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return name + " " + lastName + "," + email + "," + phone + "," + city;
	}

}
