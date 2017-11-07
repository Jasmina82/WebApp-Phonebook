package beans;

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

}
