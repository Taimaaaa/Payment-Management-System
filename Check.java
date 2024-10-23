/*Taymaa Nasser  1222640     Lab10 */

package JavaProject;

//subclass of CustomerPayment.
public class Check extends CustomerPayment implements Payable {

// class properties.
	private int accountNumber;
	private double accountBalance;
	private int type;
	public final static int CASHIER = 1;
	public final static int CERTIFIED = 2;
	public final static int PERSONAL = 3;

//no args constructor.
	public Check() {
	}

//args constructor initializing the properties.
	public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance,
			int type) {
		// calling args constructor in superclass.
		super(customerName, customerId, amount);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.type = type;
	}

//setters and getters for all properties.	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

//method that deducts the amount of authorized Check payments from account balance.
	public void deductAmountFromBalance() {
		if (getType() == CERTIFIED || getType() == PERSONAL)
			this.accountBalance -= amount;
	}

//toString method that prints class information.	
	@Override
	public String toString() {
		return "Check[ accountNumber=" + getAccountNumber() + ",  accountBalance=" + getAccountBalance() + ", type="
				+ getType() + ", " + super.toString() + "] ";

	}

//method that checks if Check is authorized before adding it to arraylist by implementing the interface Payable method.
	@Override
	public boolean isAuthorized() {
		if (getType() == CASHIER || getAmount() <= getAccountBalance())
			return true;
		else
			return false;
	}

//method that calculates payment in Check.
	@Override
	protected double CalculatePayment() {
		double payment = getAmount();
		return payment;
	}

}
