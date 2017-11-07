package data;

import beans.Contact;

public interface ContactDAO {

	public boolean addContact(Contact contact,String username);
	public boolean searchContact(Contact contact);

}
