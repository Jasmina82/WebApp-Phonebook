package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import beans.Contact;
import beans.ContactBO;
import data.ContactDAO;

public class ContactDaoTest {

	ContactBO contactBo;
	ContactDAO mockDao;
	List<Contact> contacts = new ArrayList<>();

	@Before
	public void setUp() {
		mockDao = Mockito.mock(ContactDAO.class);

		Contact contact1 = new Contact("Jaca", "Kurtovic", "dino@hotmail.com", "061 111 000", "Gracanica", 1);
		Contact contact2 = new Contact("Jasmina", "Kurtovic", "jasmina@hotmail.com", "061 000 000", "Gracanica", 2);
		contacts.add(contact1);
		contacts.add(contact2);

		contactBo = new ContactBO(mockDao);

		when(mockDao.addContact(contact1, "jasmina82")).thenReturn(true);
		when(mockDao.searchContact("Kurtovic", "jasmina82")).thenReturn(contacts);
		when(mockDao.deleteContact(1)).thenReturn(true);
		when(mockDao.editContact(contact2, 1)).thenReturn(true);
		when(mockDao.getContactById(1)).thenReturn(contacts.get(1));
		when(mockDao.getNumOfContacts("jasmina82")).thenReturn(2);
		when(mockDao.listAllContacts("jasmina82")).thenReturn(contacts);
		when(mockDao.searchContact("ja", "jasmina82")).thenReturn(contacts);
	}

	@Test
	public void whenAddContactCalledShouldReturnTrueIfContactIsAdded() {

		assertTrue(contactBo.addContact(contacts.get(0), "jasmina82"));

	}

	@Test
	public void whenSearchContactCalledShouldReturnTrueIfThereIsResult() {

		List<Contact> con = contactBo.searchContact("Kurtovic", "jasmina82");
		assertEquals(2, con.size());

	}

	@Test
	public void whenDeleteContactCalledShouldReturnTrueIfContactIsDeleted() {

		boolean deleted = contactBo.deleteContact(1);

		assertTrue(deleted);

	}
	@Test
	public void whenEditContactCalledShouldReturnTrueIfContactIsEdited() {

		boolean edited = contactBo.editContact(contacts.get(1),1);

		assertTrue(edited);

	}
	@Test
	public void whenGetContactByIdCalledShouldReturnContactWithCorrespodentId() {

		Contact contactWithId = contactBo.getContactById(1);

		assertEquals("Jasmina",contactWithId.getName());

	}
	@Test
	public void whenGetNumOfCalledContactShouldReturnNumberOfContactOfCurrentUser() {

		int numOfContacts = contactBo.getNumOfContacts("jasmina82");

		assertEquals(2,numOfContacts);

	}
	@Test
	public void whenListAllContactsCalledShouldReturnListOfContacts() {

		List<Contact> contactsList = contactBo.listAllContact("jasmina82");

		assertEquals("Jasmina",contactsList.get(1).getName());

	}
	@Test
	public void whenSearchContactCalledShouldReturnAllContactsWhichNameMatchesToPatternAnduser() {

		List<Contact> contactsList = contactBo.searchContact("ja", "jasmina82");

		assertEquals(2,contactsList.size());

	}

}
