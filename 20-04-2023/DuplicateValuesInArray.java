//Q.4 Write a Java program to find the duplicate values of an array of integer values.

package lab6;

import java.util.Arrays;

public class DuplicateValuesInArray {
	public static void main(String[] args) {
		//declaring local variables
		int i,j,count;
		//Declared and initialized the array elements
		int[] array = { 2, 7, 5, 4, 7, 1, 7, 2, 1, 7, 2, 9, 9, 9, 3, 7, 9};
	      
		//sorting an array
		Arrays.sort(array);
		System.out.println("Total Number of Duplicate Elements in an Array : ");
		
		//loop for logic implementation
		for(i=0; i<array.length; i++){
			count = 1;
			for(j=i+1; j<array.length; j++){
				if(array[j] == array[i]){
					count++;
				}
				else {
					break;
				}
			}
			i=j-1;
		   	if(count > 1){
		   		//printing the output repeated
		   		System.out.println(array[i] + " Appears " + count + " Times.");
		   	}
		}
	}
}