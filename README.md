# Java Project – Payment Management System

## Objective
Develop a system that efficiently manages various types of customer payments. This system will utilize object-oriented programming principles to define classes and interfaces. It focuses on calculating payment amounts, managing payment types, and checking payment authorization.

## Features
- **Payment Types:** Implement three payment types: Cash, Check, and CreditCard.
- **Payment Calculation:** Each payment type has its own calculation method for the final payment amount:
  - **Cash:** Payment amount minus the discount rate.
  - **Check:** Payment amount is the same as the entered amount.
  - **CreditCard:** Payment amount plus the charging fee.
- **Authorization Checks:** 
  - Check payments are authorized based on the payment type and account balance.
  - CreditCard payments are authorized based on the expiry date.
- **Comparable Payments:** The `CustomerPayment` class implements the Comparable interface to enable sorting based on calculated payment values.
- **User Interaction:** A driver class manages user input and displays payment information.

## Class Structure
The following classes and interfaces are defined in the project:

1. **CustomerPayment (abstract class)**
   - Fields: `customerName`, `customerId`, `amount`
   - Methods: Constructors, getters, setters, `toString()`, `calculatePayment()`, and `printPaymentInfo()`.

2. **Cash (extends CustomerPayment)**
   - Fields: `discountRate`
   - Methods: Constructors, `calculatePayment()`, and `printPaymentInfo()`.

3. **Check (extends CustomerPayment, implements Payable)**
   - Fields: `accountNumber`, `accountBalance`, `type`
   - Methods: Constructors, `calculatePayment()`, `printPaymentInfo()`, and `isAuthorized()`.

4. **CreditCard (extends CustomerPayment, implements Payable)**
   - Fields: `chargingFee`, `expiryDate`
   - Methods: Constructors, `calculatePayment()`, `printPaymentInfo()`, and `isAuthorized()`.

5. **Payable (interface)**
   - Method: `isAuthorized()`

6. **Driver**
   - Creates an `ArrayList<CustomerPayment>` to manage different payment types.
   - Adds payments to the list after checking authorization.
   - Sorts the list in descending order based on calculated payment.
   - Prints payment information.

## File Structure
- **src/**: Contains all the Java source files.
- **README.md**: Project documentation.

## Sample Usage
To demonstrate the functionality, the following payments are attempted to be added:

```java
new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
new Cash("Ahmad", 4444, 150, 5.0);
new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
new CreditCard("Randa", 9999, 170, 20, new Date(124, 05, 03));
new CreditCard("Hani", 6666, 150, 10, new Date(120, 06, 07));
