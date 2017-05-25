package pl.raziel.spring;

import java.util.Locale;

/**
 * Created by dlok on 25/05/2017.
 */
public class User {
	private String name;
	private int age;
	private Locale locale;

	public User(String name, int age, Locale locale) {
		this.name = name;
		this.age = age;
		this.locale = locale;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
