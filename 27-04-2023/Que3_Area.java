/* Q.1 Create an abstract class called "Shape" with an abstract method called "calculateArea".
 * Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and 
 * implement the "calculateArea" method. Create objects of both the Circle and Rectangle classes
 * and call their respective "calculateArea" methods.
*/

package lab7;

import java.util.Scanner;

abstract class Shape{ // abstract (parent) class
	double radius;
	int length,width;
	abstract void clculateArea(); // abstract method
}
class Circle extends Shape{ // child class 1
	// abstract method of parent class
	@Override
	void clculateArea() {
		System.out.println("\nArea of Circle = "+(3.14f*radius*radius)); // output
	}
}
class Rectangle extends Shape{ // child class 2
	// abstract method of parent class
	@Override
	void clculateArea() {
		System.out.println("\nArea of Rectangle = "+(length*width)); // output
	}	
}

public class Que3_Area {
	
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); // object creation of Scanner class
		System.out.println("Enter Radius of Circle:");
		double radius = sc.nextDouble();// Initialization of local variable by user
		System.out.println("Enter Length of Rectangle:");
		int length = sc.nextInt(); // Initialization of local variable by user
		System.out.println("Enter Width of Rectangle:");
		int width = sc.nextInt();// Initialization of local variable by user
		//object creation
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		//Initializing local variable by using object
		c.radius=radius;
		r.length=length;
		r.width=width;
		// method calls
		c.clculateArea();
		r.clculateArea();
	}

}
