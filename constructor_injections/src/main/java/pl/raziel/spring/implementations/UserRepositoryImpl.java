package pl.raziel.spring.implementations;

import pl.raziel.spring.api.Logger;
import pl.raziel.spring.api.UserRepository;
import pl.raziel.spring.domain.User;

public class UserRepositoryImpl implements UserRepository {

	private Logger logger;

	public UserRepositoryImpl(Logger logger) {
		this.logger = logger;
	}

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika: " + name);
		return new User(name);
	}
}
