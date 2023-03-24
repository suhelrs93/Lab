/*Q.1 Write a program in Java to display the cube of the number
upto given an integer provided by the user.*/

package lab2;
import java.util.Scanner;
public class CubeOfNum {
	public static void main(String[] args) {
		int num,cube;
		System.out.println("Enter Range for Printing Cube");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			cube=i*i*i;
			System.out.print("Cube of " + i);
			System.out.println(" = " + cube);
					
		}
	}

}
