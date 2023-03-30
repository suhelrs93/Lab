// Problem Code 1
package lab3;

import java.util.Scanner; // imported package for Scanner class 

class MyCalculator {// main class
	public static void main(String[] args) {//main method
		Scanner sc=new Scanner(System.in); // created object of Scanner class
		System.out.println("Enter any number upto 1000:");
		int n=sc.nextInt();// assigned value for variable from user
		if(n>=1 && n<=1000) {// condition for specific range
			AdvancedArithmetic ob=new AdvancedArithmetic();// created object of another class
			int sum=ob.divisor_sum(n); // invoked method of another class
			System.out.println("I implemented: AdvancedArithmetic");
			System.out.println(sum); // printing result
		}
		else { // else block
			System.out.println("Please Enter Number between specified Range... ");
		}
	}
}
class AdvancedArithmetic{ // another class
	// method signature
	public int divisor_sum(int n) { // parameterized method
		int sum = 1; // local variable
		// actual logic
		for(int i = 2; i <= n; i++ ){
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum; // Returning the result
	}
}
