import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckinAccountTest {

	Account c;
	
	@Before
	public void setUp() throws Exception{
		c = new Account(101);
	}
	
	@After 
	public void tearDown() throws Exception {
		c = null;
	}
	
	
	@Test(expected = InsufficientFundsException.class
	public final void testWithdraw() throws InsufficientFundsException {
		c.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)c.get)
		fail("Not yet implemented");
	}

}
