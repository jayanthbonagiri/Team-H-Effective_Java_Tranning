import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	String password="password";
	double amount=20000;
	
	BankAccount account;
    int accountNumber=1;
	
	@Before
	public void init() {
		account =new BankAccount(1, "Vivek", password, amount);
		System.out.println("@Before called");
	}
	
	@Test
	public void withdrawShouldFailForInvalidAmount() {
	
		boolean result=account.withdraw(1, -10,password);		
		assertEquals(true, result);
	}

	@Test
	public void withdrawShouldFailForInvalidAccountNumber() {
	
		boolean result=account.withdraw(-1,100, password);		
		assertEquals(false, result);
	}
	
	@Test public void withdrawShouldFailForInvalidPassword() {
		
		boolean result=account.withdraw(1,10, "wrong-password");
		
		assertFalse(result);
	}
	
	@Test public void withdrawShouldFailForExcessAmount() {
		boolean result=account.withdraw(1,amount+1, password);
		assertEquals(false,result);
	}
	@Test public void withdrawShouldPassForValidAmountAndPasswordAndAccountNumber() {
		String password="password";
		double amount=20000;
		int accountNumber=1;
		BankAccount account=new BankAccount(1,"Vivek",password, amount);
		boolean result=account.withdraw(accountNumber,amount, password);
		
		assertTrue(result);
		assertEquals(0, account.getBalance(),0.001);
	}
	@Test
	public void depositShouldFailForInvalidAmount() {
		boolean result =account.deposit(1,-1000);
		assertEquals(false,result);
		
	}
	@Test
	public void depositShoudFailForInvalidAccountNumber() {
		boolean result = account.deposit(-1,-2000);
		assertEquals(false,result);
	}
	@Test
	public void depositShoudPassWithValidAmountAndValidAccountNumber() {
		boolean result = account.deposit(1,3000);
		assertEquals(false,result);
	}
	@Test
	public void transferShouldFailForInvalidFromAccount()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(-100000,10000,3000,password,1000);
		assertEquals(true,result);
		
	}
	@Test
	public void transferShouldFailForInvalidToAccount()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(100000,10000,3000,password,-1000);
		assertEquals(true,result);
		
	}
	@Test
	public void transferShouldFailForInvalidPassword()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(100000,10000,3000,"wrong-password",-1000);
		assertEquals(true,result);
		
	}
	@Test
	public void transferShouldFailForInvalidAmount()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(100000,10000,-10000,"wrong-password",-1000);
		assertEquals(true,result);
		
	}
	
	@Test
	public void transferShouldFailForInvalidExcessAmount()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(1,10000,amount+1,password,1000);
		assertEquals(true,result);
		
	}
	@Test
	public void transferShouldPassForValidAccountNumberAndAccountFromAndAccountToAndPasswordAndAmount()
	{
		int accountfrom=10000;
		int accountto=1000;
		String password="password";
		double amount=4000;
		int accountNumber=1;
		boolean result=account.transfer(1,10000,4000,password,1000);
		assertEquals(false,result);
		
	}
	
}
