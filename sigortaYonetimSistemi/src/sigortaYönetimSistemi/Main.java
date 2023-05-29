package sigortaYönetimSistemi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InvalidAuthenticationException {
		AccountManager accountManager = new AccountManager();
		Scanner scanner = new Scanner(System.in);

		// Create individual account
		User individualUser = new User("John", "Doe", "john.doe@example.com", "password", "Engineer", 30);
		Account individualAccount = new Individual(individualUser);
		accountManager.addAccount(individualAccount);

		// Create enterprise account
		User enterpriseUser = new User("Jane", "Smith", "jane.smith@example.com", "password", "Manager", 35);
		Account enterpriseAccount = new Enterprise(enterpriseUser);
		accountManager.addAccount(enterpriseAccount);

		// Login
		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		Account loggedInAccount = accountManager.login(email, password);
		if (loggedInAccount != null) {
			System.out.println("Login successful!");
			loggedInAccount.showUserInfo();
		} else {
			System.out.println("Invalid email or password.");
		}
	}
}
