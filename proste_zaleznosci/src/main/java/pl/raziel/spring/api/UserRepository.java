package pl.raziel.spring.api;

import pl.raziel.spring.domain.User;

public interface UserRepository {
	User createUser(String name);

	void setLogger(Logger logger);
}
