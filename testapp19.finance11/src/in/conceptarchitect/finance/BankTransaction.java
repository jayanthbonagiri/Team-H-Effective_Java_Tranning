package in.conceptarchitect.finance;
import java.sql.Date;

public class BankTransaction {

	String Description;
	int accountnumber;
	double amount;
	Date date;
	
	public BankTransaction() {
		super();
	}
	
	public BankTransaction(String description, int accountnumber, double amount, Date date) {
		super();
		this.Description = description;
		this.accountnumber = accountnumber;
		this.amount = amount;
		this.date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BankTransaction [Description=" + Description + ", accountnumber=" + accountnumber + ", amount=" + amount
				+ ", date=" + date + "]";
	}
	
	
	
	

}