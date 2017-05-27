package pl.raziel.spring;

public class AppByConstructor {
	private UserRepository userRepository;
	private DictionaryRepository dictionaryRepository;

	public AppByConstructor(UserRepository userRepository, DictionaryRepository dictionaryRepository) {
		this.userRepository = userRepository;
		this.dictionaryRepository = dictionaryRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public DictionaryRepository getDictionaryRepository() {
		return dictionaryRepository;
	}
}
