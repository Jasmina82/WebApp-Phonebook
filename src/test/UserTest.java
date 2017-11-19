package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import beans.User;

public class UserTest {

	User user;
	
	
	@Before
	public void setUp() {
		user=new User("jasmina82", "animsaj82", "animsaj82", "Jasmina", "Kurtovic", "jasmina@hotmail.com",
				 "jasmina@hotmail.com", "XXX");
		
	}
	
	@Test
	public void whenValidRegistrationCalledShouldReturnTrueIfFieldsAreValid() {
		
		boolean isValid=user.validateRegistration();
		assertTrue(isValid);		
	}
	@Test
	public void whenValidRegistrationCalledShouldReturnFalselfEmailIsNotValid() {
		user.setEmail("jasmina.org");
		boolean isValid=user.validateRegistration();
		assertFalse(isValid);	
	}
	
	@Test
	public void whenValidRegistrationCalledShouldReturnFalselfEmailsDontMatch() {
		user.setRepeatEmail("jasmina.org");
		boolean isValid=user.validateRegistration();
		assertFalse(isValid);	
	}
	@Test
	public void whenValidRegistrationCalledShouldReturnFalselfPasswordDoesntHaveAtLeast8Characters() {
		user.setPassword("1234567");
		boolean isValid=user.validateRegistration();
		assertFalse(isValid);	
	}
	
	@Test
	public void whenValidRegistrationCalledShouldReturnFalselfPasswordsDontMatch() {
		user.setRepeatPassword("animsaj1234567");
		boolean isValid=user.validateRegistration();
		assertFalse(isValid);	
	}
	@Test
	public void whenValidRegistrationCalledShouldReturnFalselfUsernameIsMoreThan20CharactersLong() {
		user.setUsername("animsaj1234567123456789012");
		boolean isValid=user.validateRegistration();
		assertFalse(isValid);	
	}
	
}
