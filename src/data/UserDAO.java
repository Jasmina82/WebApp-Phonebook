package data;

import beans.User;

public interface UserDAO {
	
	public boolean userExist(String username);
	public boolean validPassword(String username,String password);
	public boolean addUser(User user);

}
