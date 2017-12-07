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
	public boolean editContact(Contact contact,int id) {
		return contactDao.editContact(contact,id);
	}
	public Contact getContactById(int id) {
		return contactDao.getContactById(id);
	}
	public List<Contact> listAllContact(String username) {
		return contactDao.listAllContacts(username);
	}
	public int getNumOfContacts(String username) {
		return contactDao.getNumOfContacts(username);
	}
}
