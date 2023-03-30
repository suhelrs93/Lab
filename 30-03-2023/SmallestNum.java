// Problem Code 4:
//Write a Java method to find the smallest number among three numbers. 

package lab3;
import java.util.Scanner; // Imported package
public class SmallestNum {// class 
	// Declaring parameterized method
	void smallest(int num1,int num2,int num3) {
		// actual logic for checking smallest number
		if(num1 < num2 && num1 < num3){
			System.out.println("The Smallest Number is "+num1);
        }
		else if(num2 < num3 && num2 < num1){
			System.out.println("The Smallest Number is "+num2);
        }
		else{
			System.out.println("The Smallest Number is "+num3);
        }
	}
	public static void main(String[] args) {
		int num1,num2,num3; 
        Scanner sc=new Scanner(System.in); // creating object of Scanner class
        System.out.println("Enter three Numbers:");
        // getting the value from user and assigning to the variables
        num1=sc.nextInt(); 
        num2=sc.nextInt();
        num3=sc.nextInt();
        SmallestNum ob=new SmallestNum(); // created object of class
        // calling method with the help of object
        ob.smallest(num1, num2, num3); // passing arguments to the method   
	}
}
