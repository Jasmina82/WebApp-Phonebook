package data;

public interface UserDAO {
	
	public boolean userExist(String username);
	public boolean validPassword(String username,String password);

}
