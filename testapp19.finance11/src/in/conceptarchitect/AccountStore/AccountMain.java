package in.conceptarchitect.AccountStore;

import java.util.List;
import java.util.Scanner;

public class AccountMain { 

    public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the AccountNumber:");
		int accountnumber=s.nextInt();
		System.out.println("Enter the member Name:");
		String name=s.next();
		System.out.println("Enter the Password:");
		String password=s.next();
		System.out.println("Enter the Balance:");
		Double balance=s.nextDouble();
		
		Account a=new Account(accountnumber,name,password,balance);
		AccountBo ab=new AccountBo();
		boolean b=ab.insertAccount(a);
		if(b==false) {
			System.out.println("Values Inserted");
		}
		List<Account>li=ab.getAllAccounts();
		for(Account m1:li) {
			System.out.println(m1);
			System.out.println("Data Retrived");
		}
	}
    
}
