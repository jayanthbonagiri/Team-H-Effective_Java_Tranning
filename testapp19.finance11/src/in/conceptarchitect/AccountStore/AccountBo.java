package in.conceptarchitect.AccountStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountBo {

    public List<Account>getAllAccounts()throws Exception{
		List<Account> li=new ArrayList<Account>();
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/gensis_oct_desktop_application_module", "root", "kodali5555");
		PreparedStatement ps=c.prepareStatement("select * from account");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		li.add(new Account(rs.getInt(1), rs.getString (2),rs.getString(3),rs.getDouble(4)));
		}
		c.close();
		return li;
	}
	public boolean insertAccount(Account a) throws Exception {
		boolean b=false;
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/gensis_oct_desktop_application_module", "root", "kodali5555");
		Statement stmt=c.createStatement();
		b=stmt.execute("insert into account values("+a.getAccountnumber()+",'"+a.getName()+"','"+a.getPassword()+"',"+a.getBalance()+")");
		c.close();
		return b;
	}
    
}
