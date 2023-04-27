// Q.2 Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.

package lab7;

public class Que2_StringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("This is StringBuffer"); // initial capacity 36
		
		//1. Adds the string”- This is a sample program” to existing string and display it.
		buffer.append("- This is a sample program"); //adding end of stringBuffer
		System.out.println(buffer); // Output: This is StringBuffer- This is a sample program
		
		//2. Inserts the string “Object” into the existing string at 21st position and display it.
		buffer.insert(21, "Object"); // adding string as "Object" at 21st position
		System.out.println(buffer);// Output: This is StringBuffer-Object This is a sample program

		//3. Reverses the entire string and displays it.
		buffer.reverse(); //reversing the string
		System.out.println(buffer); // Output: margorp elpmas a si sihT tcejbO-reffuBgnirtS si sihT

		//4. Replaces the word “Buffer” with “Builder” and display it.
		buffer.reverse(); // reversing again for getting actual stringBuffer
		buffer.replace(14, 20, "Builder"); // replacing "Buffer" as "Builder"
		System.out.println(buffer); // Output: This is StringBuilder-Object This is a sample program
	}

}
