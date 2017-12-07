package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import beans.User;
import beans.UserBO;
import data.UserDAO;
import data.UserDAOImplementation;

public class UserDaoTest {
	UserDAO mockDao;
	UserBO userBo;
	User user;

	@Before
	public void setUp() {
		mockDao = Mockito.mock(UserDAOImplementation.class);
		userBo = new UserBO(mockDao);
		user = new User("snowhite", "7littlefriends", "Snow", "White", "snowhite@kingdom.org", "Forest");

		when(mockDao.userExist("jasmina83")).thenReturn(true);
		when(mockDao.validPassword("jasmina82", "28animsaj")).thenReturn(true);
		when(mockDao.addUser(user)).thenReturn(true);
	}

	@Test
	public void whenUserExistCalledShouldReturnTrueIfUsernameExists() {

		boolean exists = userBo.userExists("jasmina83");
		assertTrue(exists);
	}

	

	@Test
	public void whenValidPasswordCalledShouldReturnTrueIfPasswordFitsToUsername() {

		boolean fits = userBo.validPassword("jasmina82", "28animsaj");
		assertTrue(fits);
	}

	@Test
	public void whenValidPasswordCalledShouldReturnFalseIfPasswordNotFitToUsername() {

		boolean fits = userBo.validPassword("jasmina82", "animsaj");
		assertFalse(fits);
	}

	@Test
	public void whenAddUserCalledShouldReturnTrueIfUserisAdded() {

		boolean added = userBo.addUser(user);
		assertTrue(added);
	}

	@Test
	public void whenAddUserCalledShouldReturnFalseIfUserisNotAdded() {
		User userFalse = new User();
		boolean added = userBo.addUser(userFalse);
		assertFalse(added);
	}

}
