//Q.2 Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.

package lab6;

public class CommonElementsIn3Arrays { // main class
	public static void main(String args[]) { // main method
		//Declaring and initializing the array elements
		int arr1[] = {1, 2, 3, 4, 5, 6, 7};
		int arr2[] = {2, 5, 7, 9, 10, 13};
		int arr3[] = {3, 4, 5, 6, 7, 8, 11, 12};
		// Declaring local variables
		int i = 0, j = 0, k = 0, x = 0;
		// Printing 1st Array 
		System.out.print("Array 1: ");
		for(x = 0; x < arr1.length; x++) {
			System.out.print(arr1[x] + " ");
		}
		// Printing 2nd Array 
		System.out.print("\nArray 2: ");
		for(x = 0; x < arr2.length; x++) {
			System.out.print(arr2[x] + " ");
		}
		// Printing 3rd Array 
		System.out.print("\nArray 3: ");
		for(x = 0; x < arr3.length; x++) {
			System.out.print(arr3[x] + " ");
		}
		System.out.println("\nThe common elements in the Above sorted arrays are: ");
		//actual logic for checking common elements
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			}
			else if (arr1[i] < arr2[j]) {
				i++;
			}
			else if (arr2[j] < arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
	}
}