package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import beans.Contact;

public class ContactTest {
	
	Contact contact1;
	Contact contact2;
	
	@Before
	public void setUp() {
		contact1=new Contact("Micky","Mouse","mouse@micky.org","061 111 111","Disneyland");
		contact2=new Contact();
	}

	@Test
	public void whenValidCalledShouldReturnTrueIfFieldsAreValid() {
		
		boolean isValid=contact1.validate();
		assertTrue(isValid);		
	}
	@Test
	public void whenValidCalledShouldReturnFalselfEmailIsNotValid() {
		contact1.setEmail("mickymouse.org");
		boolean isValid=contact1.validate();
		assertFalse(isValid);	
	}
	@Test
	public void whenValidCalledShouldReturnTruelfPhoneMatchesToFirstPattern() {
		
		boolean isValid=contact1.validate();
		assertTrue(isValid);	
	}
	@Test
	public void whenValidCalledShouldReturnTruelfPhoneMatchesToSecondPattern() {
		contact1.setPhone("00 38762 123 123");
		boolean isValid=contact1.validate();
		assertTrue(isValid);	
	}
	@Test
	public void whenValidCalledShouldReturnFalseIfPhoneDontMatchTwoPatterns() {
		contact1.setPhone("00");
		boolean isValid=contact1.validate();
		assertFalse(isValid);	
	}
	
	

}
