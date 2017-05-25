package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.raziel.spring.api.UserRepository;
import pl.raziel.spring.domain.User;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja2.xml");

		UserRepository userRepository = context.getBean("repoUzytkownikow", UserRepository.class);

		User janek = userRepository.createUser("Janek");
	}
}
