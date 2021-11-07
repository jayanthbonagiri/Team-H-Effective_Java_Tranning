package in.conceptarchitect.AccountStore;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	String url="jdbc:mysql://localhost:3306/gensis_oct_desktop_application_module";
	String username="root";
	String password="kodali5555";
	Connection connection=null;
	
	@Before
	void setUp() throws Exception {
		connection=DriverManager.getConnection(url,username,password);
		 var statement = connection.createStatement();
		statement.executeUpdate(String.format("insert into Account values('%d','%s','%s',%f)","687459", "Vidya","pass@1",2000));
	}
	
	@After
	public void clean() throws Exception {
		var statement= connection.createStatement();
		statement.executeUpdate("delete from Account where name='Vidya'");
		connection.close();
	}
	
	@Test
	void connectionWorksWithRightCredential() throws SQLException {
		
		assertNotNull(connection);
	}
	
	@Test()
	void connectionFailsWithWrongCredential() throws SQLException {
		
		assertThrows(SQLException.class, ()->{
			var connection= DriverManager.getConnection(url,username,"wrong-password");
		});
	}

	
	@Test
	public void failsToFetchRecordWithWrongIsbn() throws SQLException {
		
		var statement=connection.createStatement();
		var results= statement.executeQuery("select * from Accounts where name='invalid'");
		
		assertFalse(results.next());
		
		
	}	

}


