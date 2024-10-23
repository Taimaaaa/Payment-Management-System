/*Taymaa Nasser  1222640     Lab10 */

package JavaProject;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

//creating an arraylist of CustomerPayment objects.
		ArrayList<CustomerPayment> payments = new ArrayList<>();

//check1 is not authorized as it's not of type cashier nor is the amount less than the balance. 
		CustomerPayment check1 = new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
		if (((Check) check1).isAuthorized()) {
			((Check) check1).deductAmountFromBalance();
			payments.add(check1);
		}

//cash is added to list payments.
		CustomerPayment cash = new Cash("Ahmad", 4444, 150, 5.0);
		payments.add(cash);

//check2 is authorized as it's of type cashier. It is added to list payments.
		CustomerPayment check2 = new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
		if (((Check) check2).isAuthorized()) {
			((Check) check2).deductAmountFromBalance();
			payments.add(check2);
		}

//check3 is authorized as the amount is less than the balance. It is added to list payments.
		CustomerPayment check3 = new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
		if (((Check) check3).isAuthorized()) {
			((Check) check3).deductAmountFromBalance();
			payments.add(check3);
		}

//creditCard1 is authorized as expiry date is greater than current date. It is added to list payments.
		@SuppressWarnings("deprecation")
		CustomerPayment creditCard1 = new CreditCard("Randa", 9999, 170, 20, new Date(124, 05, 03));
		if (((CreditCard) creditCard1).isAuthorized())
			payments.add(creditCard1);

//creditCard2 is not authorized as expiry date is less than current date.
		@SuppressWarnings("deprecation")
		CustomerPayment creditCard2 = new CreditCard("Hani", 6666, 150, 10, new Date(120, 06, 07));
		if (((CreditCard) creditCard2).isAuthorized())
			payments.add(creditCard2);

//sorts all added payments in descending order and then prints the sorted list.		
		Collections.sort(payments);
		for (int i = 0; i < payments.size(); i++) {
			payments.get(i).printPaymentInfo();
		}

	}

}
