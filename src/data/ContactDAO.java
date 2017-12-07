package data;

import java.util.List;

import beans.Contact;

public interface ContactDAO {

	public boolean addContact(Contact contact,String username);
	public List<Contact> searchContact(String contactName,String username);
	public boolean deleteContact(int id);
	public Contact getContactById(int id);
	public boolean editContact(Contact contact,int id);
	public List<Contact> listAllContacts(String username);
	public int getNumOfContacts(String username);

}
