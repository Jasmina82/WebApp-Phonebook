package beans;

public class User {
	String username = "";
	String password = "";
	String repeatPassword;
	String name;
	String lastName;
	String email;
	String repeatEmail;
	String city;
	String message;

	public User() {

	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(String username, String password, String repeatPassword, String name, String lastName, String email,
			String repeatEmail, String city) {
		this.username = username;
		this.password = password;
		this.repeatPassword = repeatPassword;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.repeatEmail = repeatEmail;
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
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

	public String getRepeatEmail() {
		return repeatEmail;
	}

	public void setRepeatEmail(String repeatEmail) {
		this.repeatEmail = repeatEmail;
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

	public boolean validateRegistration() {

		if (username.length() > 20) {
			message = "Username to long";
			return false;
		}
		if (!email.matches("\\w+@\\w+\\.\\w+")) {
			message = "Invalid email";
			return false;
		}
		if (!email.equals(repeatEmail)) {
			message = " Emails don't match.";
			return false;
		}
		if (password.length() < 8) {
			message = "Password must be at least 8 characters long.";
			return false;
		}
		if (!password.equals(repeatPassword)) {
			message = "Passwords don't match.";
			return false;
		}
		return true;
	}

}
