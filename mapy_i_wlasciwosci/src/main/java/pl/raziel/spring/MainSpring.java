package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = (SomeBean) context.getBean("someBean");
		SomeBean otherBean = (SomeBean) context.getBean("otherBean");

		System.out.println(someBean.getLocales());
		System.out.println(someBean.getSettings());

		System.out.println("\n" + otherBean.getLocales());
		System.out.println(otherBean.getSettings());

		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}
