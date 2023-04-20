/*Q.1 A Java program to find all pairs of elements in an array
 * whose sum is equal to a specified number
 */

package lab6;

import java.util.Scanner;

public class FindPairsOfArrEle {
	public static void main(String args[]) {
		//Declaring and initializing the array elements
		int myArray [] = {3, 4, 5, 6, 7, 8, 11, 12};
		// printing Array Elements
		System.out.println("Given Array Elements Are : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number for checking \n Pairs of elements in an array whose sum is equal to Entired number: ");
		int num = sc.nextInt();//getting user input
		boolean found = false; // local variable
		System.out.println("Pairs of Elements and their Sum : ");
		//actual logic for checking and printing pairs
		for (int i =  0; i < myArray.length; i++) {
			for (int j  = i+1; j < myArray.length; j++) {
				if(myArray[i]+myArray[j] == num) {
					System.out.println(myArray[i]+" + "+myArray[j]+" =  "+num);
					found = true;
				}
			}
		}
		if (found == false) { // if there is no pair found
			System.out.println("No pair found whose Sum is " + num);
		}
	}
}