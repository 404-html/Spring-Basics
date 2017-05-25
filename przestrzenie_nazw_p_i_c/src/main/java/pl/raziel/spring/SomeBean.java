package pl.raziel.spring;

/**
 * Created by dlok on 25/05/2017.
 */
public class SomeBean {
	private String stringValue;
	private int intValue;
	private User user;

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SomeBean{");
		sb.append("stringValue='").append(stringValue).append('\'');
		sb.append(", intValue=").append(intValue);
		sb.append(", user=").append(user);
		sb.append('}');
		return sb.toString();
	}
}
