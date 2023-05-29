package sigortaYönetimSistemi;

public class Enterprise extends Account {
	public Enterprise(User user) {
		super(user);
	}

	@Override
	public void showAccountType() {
		System.out.println("Account Type: Enterprise");
	}
}
