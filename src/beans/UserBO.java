package beans;

import data.UserDAO;
import data.UserDAOImplementation;

public class UserBO {

	UserDAO userDao = new UserDAOImplementation();

	public UserBO() {

	}

	public UserBO(UserDAO userDao) {
		this.userDao = userDao;
	}

	public boolean userExists(String username) {

		return userDao.userExist(username);

	}

	public boolean validPassword(String username, String password) {

		return userDao.validPassword(username, password);

	}

	public boolean addUser(User user) {
		return userDao.addUser(user);
	}
}
