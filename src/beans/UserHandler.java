package beans;

import data.UserDAO;
import data.UserDAOImplementation;

public class UserHandler {

	 UserDAO userInfo = new UserDAOImplementation();

	public boolean userExists(String username) {

		return userInfo.userExist(username);
		
	}
	
	public  boolean validPassword(String username,String password) {
		
		return userInfo.validPassword(username, password);
		
	}

}
