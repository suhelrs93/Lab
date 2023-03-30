// Problem Code 5:
//Create a Student class to take different types constructor to set different properties ( values ).

package lab3;

public class Student {
	// instance variables
	int age;
	String name;
	// cons 1
	Student(){ // default cons
		System.out.println("Employee age and Names are shown Below:");
	}
	// cons 2
	Student(int a, String n){ // parameterized Constructor
		age = a;
		name = n;
	}
	void show() { // user defined method
		System.out.println("Age= "+age+ " "+"Name= "+name);
	}
	// main method
	public static void main(String[] args) {
		Student s=new Student(); // called default cons
		// parameterized cons call
		Student s1=new Student(24, "Suhel");
		Student s2=new Student(25, "Akshay");
		Student s3=new Student(22, "Yogesh");
		// user defined method called using different objects
		s1.show();
		s2.show();
		s3.show();
	}
		

}
