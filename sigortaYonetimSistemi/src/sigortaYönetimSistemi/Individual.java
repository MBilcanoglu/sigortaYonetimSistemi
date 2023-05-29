package sigortaYönetimSistemi;

public class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Individual");
    }
}
