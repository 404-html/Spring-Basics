package pl.raziel.spring;

/**
 * Created by dlok on 25/05/2017.
 */
public class User {
	private String name;
	private int age;

	private User() {
	}


	// must be static
	public static User getInstance(String name, int age) {
		User user = new User();
		user.name = name;
		user.age = age;
		return user;
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
