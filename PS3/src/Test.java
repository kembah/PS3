
public class Test {
	public static void main (String[] args){
		int id = 1122;
		double balance = 20000;
		double aInterestRate = 4.5;
		
		
// Need to make new account
	Account account = new Account(id,balance);
	//no constructor for aInteresttRate. Only takes 
	// in parameters for Account
	account.setAnnualInterestRate(aInterestRate);
	account.withdraw(2500);		
	account.deposit(3000);
	System.out.println("Balance:" + account.getBalance());
	System.out.println("The Monthly Interest Rate:" + account.getMonthlyInterestRate());
	System.out.println("Date:" + account.getdateCreated());		
		
	}
}
