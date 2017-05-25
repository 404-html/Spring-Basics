package pl.raziel.spring;

import java.util.logging.Logger;

/**
 * Created by dlok on 25/05/2017.
 */
public class UsersCreator {

	Logger logger = Logger.getLogger(this.getClass().getName());

	public User createUser(String userName) {
		logger.info("Tworzenie użytkownika: " + userName);

		User user = new User();
		user.setName(userName);
		return user;
	}
}
