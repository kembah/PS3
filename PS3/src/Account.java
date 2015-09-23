import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	// Date is an already built in code
	private Date dateCreated;

	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account (int id, double initialBalance){
// passing in two parameters. Gives those values to
// the constructor to construct. 
		this.id = id;
		this.balance = initialBalance;
		this.annualInterestRate = 0;
		dateCreated = new Date();
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate/12);
	}
	public void withdraw(double amount){
		// show what the new balance is
		//void = no return
		balance = balance - amount;
	}
	public void deposit(double amount){
		// show what the new balance is
		//void = no return
		balance = balance + amount;
	}
}
