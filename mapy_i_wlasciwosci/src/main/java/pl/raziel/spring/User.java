package pl.raziel.spring;

/**
 * Created by dlok on 26/05/2017.
 */
public class User {
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("name='").append(name).append('\'');
		sb.append(", address=").append(address);
		sb.append('}');
		return sb.toString();
	}
}
