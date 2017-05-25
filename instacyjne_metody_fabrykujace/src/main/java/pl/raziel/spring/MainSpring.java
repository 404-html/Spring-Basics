package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlok on 25/05/2017.
 */
public class MainSpring {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		User user = (User) context.getBean("someUser");
		System.out.println(user);
	}
}
