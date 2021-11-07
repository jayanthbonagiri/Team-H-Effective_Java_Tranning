package in.conceptarchitect.AccountStore;

public class Account {
	
	private int accountnumber;
	private String name;
	private String password;
	protected double balance;
	
	public Account() {
		super();
	}

	public Account(int accountnumber, String name, String password, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", password=" + password + ", balance="
				+ balance + "]";
	}

	
	
	

}
