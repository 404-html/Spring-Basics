package pl.raziel.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by dlok on 25/05/2017.
 */
public class FactoryMethodMain {

	public static void main(String[] args) {
//
//		Locale locale = Locale.getDefault();
//		Calendar calendar = new GregorianCalendar(locale);
//		System.out.println(new SimpleDateFormat().format(calendar.getTime()));


		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class);
		final DateFormat dateFormat = (DateFormat) context.getBean("formatter");

		System.out.println(dateFormat.format(calendar.getTime()));


	}
}
