/* Q.4 Write a java program to generate a following @'s triangle.
 * 
 * @@@@@
 * @@@@
 * @@@
 * @@
 * @
 */

package lab2;

public class SymbolsTriangle {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
}
