package pl.raziel.spring;

/**
 * Created by dlok on 26/05/2017.
 */
public class Address {
	private String locality;
	private String zipCode;
	private String street;
	private String streetNumber;

	public Address(String locality, String zipCode, String street, String streetNumber) {
		this.locality = locality;
		this.zipCode = zipCode;
		this.street = street;
		this.streetNumber = streetNumber;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Address{");
		sb.append("locality='").append(locality).append('\'');
		sb.append(", zipCode='").append(zipCode).append('\'');
		sb.append(", street='").append(street).append('\'');
		sb.append(", streetNumber='").append(streetNumber).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
