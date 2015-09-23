import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckinAccountTest {

	Account c;
	
	@Before
	public void setUp() throws Exception{
		c = new Account(1122, 20000);
	}
	
	@After 
	public void tearDown() throws Exception {
		c = null;
	}
	
	
	@Test(expected = InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		c.deposit(3000);
		assertEquals("True",(long)c.getBalance(),(long)500.00);
	c.withdraw(900);
	}
	
	@Test
	public final void testDeposit() {
		int x = 0; 
				
		while (x<20) {
			c.deposit(3000);
		}
		
	}

}
