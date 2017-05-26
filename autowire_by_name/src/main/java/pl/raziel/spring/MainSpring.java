package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlok on 26/05/2017.
 */
public class MainSpring {
	public static void main(String[] args) {

		final ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = (SomeBean) context.getBean("someBean");

		System.out.println(someBean.getInjectedBean1().getName());
		System.out.println(someBean.getInjectedBean2().getName());
	}
}
