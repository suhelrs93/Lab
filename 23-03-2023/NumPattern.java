/* Q.2 Write a program in Java to make such a pattern 
 * like right angle triangle with a number which will repeat a number in a row.
 * The pattern is as follows : 
 * 1
 * 22
 * 333
 * 4444  */

package lab2;

public class NumPattern {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
