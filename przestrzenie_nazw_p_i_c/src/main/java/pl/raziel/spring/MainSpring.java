package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlok on 25/05/2017.
 */
public class MainSpring {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = (SomeBean) context.getBean("someBean");
		System.out.println(someBean.getIntValue());

		SomeBean otherBean = (SomeBean) context.getBean("otherBean");
		System.out.println(otherBean);

		// not working _1 for SomeBean bean with constructors...
		SomeBean thirdBean = (SomeBean) context.getBean("thirdBean");
		System.out.println(thirdBean);
	}
}
