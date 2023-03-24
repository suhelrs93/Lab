/* Q.3 Write a Java program that reads an integer and 
 * check whether it is negative, zero, or positive.
 */
package lab2;
import java.util.Scanner;
public class CheckNumSign {
	public static  void main(String[] args) {
		int num;
		System.out.println("Enter any Number for checking Positive, Negative or Zero :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if (num<0){
			System.out.println(num + " is Negative Number.");
		}
		else if(num>0) {
			System.out.println(num + " is Positive Number.");
		}
		else
			System.out.println("Given Number is Zero(0)");
	}

}
