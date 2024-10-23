/*Taymaa Nasser  1222640     Lab10 */
package JavaProject;

import java.util.*;

//subclass of CustomerPayment.
public class CreditCard extends CustomerPayment implements Payable {

//class properties.	
	private double chargingFee;
	private Date expiryDate;

// no args constructor.
	public CreditCard() {
	}

//args constructor initializing the properties.
	public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
		// calling args constructor in superclass.
		super(customerName, customerId, amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}

//setters and getters for all properties.	
	public double getChargingFee() {
		return chargingFee;
	}

	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

//toString method that prints class information.	
	@Override
	public String toString() {
		return "CreditCard[ chargingFee=" + getChargingFee() + ", expiryDate=" + getExpiryDate() + ", "
				+ super.toString() + "] ";

	}

//method that checks if CreditCard is authorized before adding it to arraylist by implementing the interface Payable method.
	@Override
	public boolean isAuthorized() {
		if (expiryDate.compareTo(new Date()) >= 0)
			return true;
		else
			return false;
	}

//method that calculates payment in CreditCard.
	@Override
	protected double CalculatePayment() {
		double payment = getAmount() + getChargingFee();
		return payment;
	}

}
