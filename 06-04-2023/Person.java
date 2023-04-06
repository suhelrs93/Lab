/* Q2. Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 * Create a child class called "Student" that inherits from Person 
 * and has an additional attribute called "grade" and a method called "study".
 * Create an object of the Student class and call both the "speak" and "study" methods.
 */
package lab4;

public class Person { // parent class
	// instance variables
	String name = "Suhel";
	int age = 24;
	void speak() { //user defined method of parent class
		System.out.println("Hello...");
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	
	public static void main(String[] args) { // main method
		Student s = new Student(); // creating object
		// method call
		s.speak();
		s.study();
	}
}
class Student extends Person{ // child class
	String grade = "A+"; // instance variable
	void study() { //user defined method of child class
		System.out.println("I got "+grade+" Grade in my Graduation");
	}
}
