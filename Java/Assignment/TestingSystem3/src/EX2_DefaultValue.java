import java.time.LocalDate;

public class EX2_DefaultValue {
	
	public static void main(String[] args) {

		Account[] accounts = new Account[5];

		// Insert Account
		for (int i = 0; i < 5; i++) {
			Account account = new Account();
			account.email = "Email " + (i + 1);
			account.username = "Username " + (i + 1);
			account.fullname = "Full name " + (i + 1);
			account.createDate = LocalDate.now();

			accounts[i] = account;
		}

		// Print Accounts
		for (Account account : accounts) {
			System.out.println(account.email);
			System.out.println(account.username);
			System.out.println(account.fullname);
			System.out.println(account.createDate);
			System.out.println("\n");
		}

	}
}
