package beans;

import java.util.List;

import data.ContactDAO;
import data.ContactDAOImplementation;

public class ContactBO {
	
	
	ContactDAO contactDao=new ContactDAOImplementation();

	public ContactBO() {

	}

	public ContactBO(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}

	public boolean addContact(Contact contact,String username) {
		return contactDao.addContact(contact,username);
	}
	
	public List<Contact> searchContact(String contactName,String username) {
		return contactDao.searchContact(contactName,username);
	}
	public boolean deleteContact(int id) {
		return contactDao.deleteContact(id);
	}
}
