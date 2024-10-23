/*Taymaa Nasser  1222640     Lab10 */

package JavaProject;

//subclass of CustomerPayment.
public class Cash extends CustomerPayment {

//class property.
	private double discountRate;

//args constructor.
	public Cash() {
	}

//args constructor initializing the properties.	
	public Cash(String customerName, int customerId, double amount, double discountRate) {
		// calling args constructor in superclass.
		super(customerName, customerId, amount);
		this.discountRate = discountRate;
	}

//setters and getters for all properties.
	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

//toString method that prints class information.	
	@Override
	public String toString() {
		return "Cash[ discountRate=" + getDiscountRate() + ", " + super.toString() + "] ";
	}

//method that calculates payment in Cash.
	@Override
	protected double CalculatePayment() {
		double payment = (getAmount() - (getAmount() * (getDiscountRate() / 100)));
		return payment;
	}

}
