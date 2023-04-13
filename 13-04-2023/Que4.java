/* Q.4 Create an interface called "Person" with a method called "speak". 
 * Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method. 
 * Create objects of both the Student and Teacher classes and call their respective "speak" methods.
 */

package lab5;

interface Person{ // Interface (parent)
	void speak(); // abstract method 
}
class Student implements Person{ // child class 1
	// implementation of abstract method of interface
	@Override
	public void speak() {
		System.out.println("speak(): method Implementation in Student class");
	} 
}
class Teacher implements Person{ // child class 2
	// implementation of abstract method of interface
	@Override
	public void speak() {
		System.out.println("speak(): method Implementation in Teacher class");//
	}
}
public class Que4 { // main class
	public static void main(String[] args) { // main method
		// object creation
		Student s = new Student();
		Teacher t = new Teacher();
		// method call
		s.speak();
		t.speak();
	}
}
