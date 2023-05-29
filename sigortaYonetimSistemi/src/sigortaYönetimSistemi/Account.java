package sigortaYönetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public abstract class Account implements Comparable<Account> {
	private AuthenticationStatus authenticationStatus;
	private User user;
	private ArrayList<Insurance> insurances;

	public Account(User user) {
		this.authenticationStatus = AuthenticationStatus.FAIL;
		this.user = user;
		this.insurances = new ArrayList<>();
	}

	public void login(String email, String password) throws InvalidAuthenticationException {
		if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
		} else {
			throw new InvalidAuthenticationException("Invalid email or password.");
		}
	}

	public void addInsurance(Insurance insurance) {
		insurances.add(insurance);
	}

	public abstract void showAccountType();

	public void showUserInfo() {
		System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Profession: " + user.getOccupation());
		System.out.println("Age: " + user.getAge());
		System.out.println("Last Login Date: " + user.getLastLoginDate());
		System.out.println("Addresses:");
		for (Address address : user.getAddresses()) {
			System.out.println(address.getAddressInfo());
		}
		System.out.println("Insurances:");
		for (Insurance insurance : insurances) {
			System.out.println("Insurance Name: " + insurance.getName());
			System.out.println("Insurance Price: " + insurance.getPrice());
			System.out.println("Insurance Start Date: " + insurance.getStartDate());
			System.out.println("Insurance End Date: " + insurance.getEndDate());
			System.out.println("Calculated Price: " + insurance.calculate());
			System.out.println("-----------------------");
		}
	}

	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public User getUser() {
		return user;
	}

	public ArrayList<Insurance> getInsurances() {
		return insurances;
	}

	@Override
	public int compareTo(Account other) {
		return user.getLastLoginDate().compareTo(other.getUser().getLastLoginDate());
	}
}
