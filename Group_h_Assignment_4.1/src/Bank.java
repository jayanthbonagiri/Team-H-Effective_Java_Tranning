
public class Bank {
	String name; //name of the bank
	int lastId=0;
	
	double interestRate;
	
	
	public void creditInterst() {
		//credit interest to all accounts
		for(int i=1;i<=lastId;i++) {
			
			accounts[i].creditInterest(interestRate);
		}
	}
	
	public  double getInterestRate() {
		return interestRate;
	}

	public  void setInterestRate(double interestRate) {
		
		BankAccount.interestRate = interestRate;
	}
	
	
	
	public Bank(String name, double interestRate) {
		super();
		this.name = name;
		this.interestRate = interestRate;
	}
	
	BankAccount [] accounts= new BankAccount[100]; //MAX 100. May not be great for large banks
	
	public int openAccount(String name, String password, double amount) {
		int accountNumber= ++ lastId;
		BankAccount account= new BankAccount(accountNumber, name, password,amount);
		accounts[accountNumber] = account; //store this account in the array.
		return accountNumber;
	}
	
	private BankAccount getAccountByNumber(int accountNumber) {
		// TODO Auto-generated method stub
		if(accountNumber>0 && accountNumber<=lastId)
			return accounts[accountNumber];
		else
			return null;
	}
	
	public boolean deposit(int accountNumber, double amount) {
		
		BankAccount account = getAccountByNumber(accountNumber);
		
		return account.deposit(accountNumber,amount);
	}
	public boolean withdraw (int accountNumber, double amount, String password) {
		
		BankAccount account = getAccountByNumber(accountNumber);
		
		return account.withdraw(accountNumber,amount,password);
		
	}
	public boolean transfer (int accountNumber, double amount,int accountfrom,String password,int accountto) {
		
		BankAccount transferred = getAccountByNumber(accountfrom);
		return transferred.transfer(accountNumber,accountfrom,amount,password,accountto);
	
		
	}


}
