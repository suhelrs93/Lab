// Problem Code 2
package lab3;

class RectangleTest { // main class
	public static void main(String[] args) {// main method
		// Creating object and passing arguments
		Rectangle rec=new Rectangle(45, 20);	
	}
}
class Rectangle {// another class
	// instance variables
	private int length, breadth; // private variables
	
	Rectangle(int l, int b){ // parameterized constructor
		// assigning default values for variables
		length=40;
		breadth=20;
		System.out.println("Area = "+(length*breadth)); // Calculating area
		// assigning passed values for instance variables
		length=l;
		breadth=b;
		System.out.println("New Area = "+(length*breadth)); // Calculating new area
	}
}