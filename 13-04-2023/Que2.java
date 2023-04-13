/* Q.2 Create an abstract class called "BankAccount" with attributes such as account number and balance, 
 * and abstract methods called "deposit" and "withdraw". Create a subclass called "CheckingAccount" 
 * that inherits from BankAccount and implements the "deposit" and "withdraw" methods. 
 * Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
 */

package lab5;

abstract class BankAccount{ // abstract (parent) class
	// instance variables
	int accountNumber;
	double balance;;
	abstract void deposit(); // abstract method 1
	abstract void withdraw(); // abstract method 2
}
class CheckingAccount extends BankAccount{ // child class
	// abstract method 1 of parent class
	@Override
	void deposit() {
		System.out.println("deposite(): method 1 of parent class BankAccount");
	}
	
	// abstract method 2 of parent class
	@Override
	void withdraw() {
		System.out.println("withdraw(): method 2 of parent class BankAccount");
	}
}

public class Que2 { // main class
	public static void main(String[] args) { // main method
		CheckingAccount ca = new CheckingAccount(); // creating object
		// method calls
		ca.deposit();
		ca.withdraw();
	}
}
