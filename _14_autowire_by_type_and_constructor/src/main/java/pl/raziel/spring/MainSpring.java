package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		AppByType appByType = (AppByType) context.getBean("appByType");
		System.out.println(appByType.getUserRepository().exists("TwojaStara"));
		System.out.println(appByType.getDictionaryRepository().getMapValue());

		AppByConstructor appByConstructor = (AppByConstructor) context.getBean("appByConstructor");
		System.out.println(appByConstructor.getUserRepository().exists("JegoStara"));
		System.out.println(appByConstructor.getDictionaryRepository().getMapValue());
	}
}
