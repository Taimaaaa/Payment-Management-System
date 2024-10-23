/*Taymaa Nasser  1222640     Lab10 */

package JavaProject;

//Superclass that contains abstract methods.
public abstract class CustomerPayment implements Comparable<CustomerPayment> {

// class properties.
	protected String customerName;
	protected int customerId;
	protected double amount;

// no args constructor.
	protected CustomerPayment() {
	}

//args constructor initializing the properties.
	protected CustomerPayment(String customerName, int customerId, double amount) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}

//setters and getters for all properties.
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

//abstract method to be implemented in subclasses Cash,Check and CreditCard. Calculates Payments differently in each class.
	protected abstract double CalculatePayment();

//toString method to print properties of superclass. It overrides the toString method in superclass Object.
	@Override
	public String toString() {
		return "customerName=" + getCustomerName() + ", customerId=" + getCustomerId() + ", amount=" + getAmount();
	}

//method that prints both properties of superclass and the payment of the desired subclass.
	void printPaymentInfo() {
		String printString = toString() + " Payment=" + CalculatePayment();
		System.out.println(printString);
	}

//method allows for comparison between the payments of the subclasses.  in descending order.
	public int compareTo(CustomerPayment Obj) {
		if (this.CalculatePayment() == Obj.CalculatePayment())
			return 0;
		else if (this.CalculatePayment() < Obj.CalculatePayment())
			return 1;
		else
			return -1;
	}
	}
