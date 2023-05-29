package sigortaYönetimSistemi;

import java.util.TreeSet;

public class AccountManager {
	private TreeSet<Account> accounts;

	public AccountManager() {
		this.accounts = new TreeSet<>();
	}

	public Account login(String email, String password) {
		for (Account account : accounts) {
			try {
				account.login(email, password);
				return account;
			} catch (InvalidAuthenticationException e) {
				// Authentication failed, continue checking other accounts
			}
		}
		return null;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
	}
}
