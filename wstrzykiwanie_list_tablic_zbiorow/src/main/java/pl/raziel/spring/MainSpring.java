package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by dlok on 25/05/2017.
 */
public class MainSpring {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = (SomeBean) context.getBean("someBean");

		System.out.println(Arrays.toString(someBean.getLongsArray()));
		System.out.println(someBean.getIntegersSet());
		System.out.println(someBean.getStringsList());
	}
}
