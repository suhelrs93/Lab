/*Q.3 Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
 * Create a class called "CheckingAccount" that implements the BankAccount interface and implements 
 * the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class 
 * and call both the "deposit" and "withdraw" methods.
 */
package lab5;

interface BankAccount1{ // Interface (parent)
	void deposit(); // abstract method 1
	void withdraw(); // abstract method 2
}
class CheckingAccount1 implements BankAccount1{ // child class
	// implementation of abstract method 1 of parent class
	@Override
	public void deposit() {
		System.out.println("deposit(): Parent abstract method 1");
	}
	
	// implementation of abstract method 2 of parent class
	@Override
	public void withdraw() {
		System.out.println("withdraw(): Parent abstract method 2");
	} 
}

public class Que3 { // main class
	public static void main(String[] args) { // main method
		CheckingAccount1 ca = new CheckingAccount1(); // creating object
		// method calls
		ca.deposit();
		ca.withdraw();
	}

}
