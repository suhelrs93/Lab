/* Q1. Create a parent class called "Vehicle" with attributes such as brand, model, year, 
 * and a method called "drive". Create a child class called "Car" that inherits from Vehicle 
 * and has an additional attribute called "color" and a method called "honk".
 * Create an object of the Car class and call both the "drive" and "honk" methods. */
package lab4;

public class Vehicle { // parent class
	// instance variables
	String barand = "BMW";
	String model = "latest";
	int year = 2023;
	void drive() { //user defined method of parent class
		System.out.println("It's drive method of Vehical class");
		System.out.println("Brand: "+barand);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
	
	public static void main(String[] args) { // main method
		Car c = new Car(); // creating object
		// method call
		c.drive();
		c.honk();
	}
}
class Car extends Vehicle{ // child class
	String color = "Red"; // instance variable
	void honk() { //user defined method of child class
		System.out.println("\nIt's 'honk' method of 'Car' class");
		System.out.println("Colour: "+color);
	}
}
