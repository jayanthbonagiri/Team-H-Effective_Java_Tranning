package in.conceptarchitect.finance.Serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.Exception;
import in.conceptarchitect.finance.BankAccount;

public class SAccount {
    public static void main(String []args)
	{
		BankAccount account=null;
		account.getName();
		account.getAccountNumber();
		account.getBalance();
		try
		{
			FileOutputStream fout=new FileOutputStream("/testapp19.finance11/src/in/conceptarchitect/finance/BankAccount.java");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(account);
			out.close();
			fout.close();
			System.out.printf("SucessFully Data Stored");	
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

    
}
