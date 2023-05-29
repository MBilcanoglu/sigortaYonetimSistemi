package sigortaYönetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String occupation;
	private int age;
	private ArrayList<Address> addresses;
	private Date lastLoginDate;

	public User(String firstName, String lastName, String email, String password, String occupation, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.occupation = occupation;
		this.age = age;
		this.addresses = new ArrayList<>();
		this.lastLoginDate = new Date();
	}

	public void showUserInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Occupation: " + occupation);
		System.out.println("Age: " + age);
		System.out.println("Last Login Date: " + lastLoginDate);
		System.out.println("Addresses:");
		for (Address address : addresses) {
			address.getAddressInfo();
		}
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

}
