//Q.3 Write a Java program to test if an array contains a specific value.

package lab6;

public class CheckSpecificValueInArray { // main class
	//declaring instance variables
    int specificValue;
    boolean found = false;
    //Declaring and initializing the array elements
    int[] arr = {1, 3, 4, 7, 5, 2, 9};
    
    //user defined parameterized method
	void checkValue(int num) {
		this.specificValue = num; // assigning value to instance variable
		//loop for logic implementation
	    for (int n : arr) {
	    	if (n == specificValue) {
	    		found = true;
	    		break; // breaking loop when found
	    	}
	    }	    
	    if(found) {
	    	System.out.println(specificValue + " is found.");
	    	found = false;
	    }
	    else {
	    	System.out.println(specificValue + " is not found.");
	    }
	}
	public static void main(String[] args) {// main method
		//Creating object
		CheckSpecificValueInArray c = new CheckSpecificValueInArray();
		//Testing : calling method with different arguments
		c.checkValue(7); // 1st call
		c.checkValue(6); // 2nd call
		c.checkValue(9); // 3rd call
	}
}