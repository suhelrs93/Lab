//Q.1 Write a program which creates a String “Welcome to Java World” and performs the following.

package lab7;

public class Que1_String {
	public static void main(String[] args) {
		
		String s = "Welcome to Java World"; // string literals
		
		//• Returns the character at 5th position and display it.
		System.out.println(s.charAt(5)); //m
		
		//• Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		System.out.println(s.compareToIgnoreCase("welCOme"));
	
		//• Concatenates “- Let us learn” to the above string and display it.
		s = s.concat("- Let us learn");//adding end of the string
		System.out.println(s); //Welcome to Java World- Let us learn
		
		// • Returns the position of the first occurrence of character ‘a’ and display it.
		System.out.println(s.indexOf('a')); // 12
		
		//• Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		String newS=s.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(newS);  

		//• Returns string between 4th position and 10th position and display it.
		System.out.println(s.substring(5, 10)); // me to
		
		//• Returns the lowercase of the string and display it.
		System.out.println(s.toLowerCase()); // welcome to java world- let us learn
		
	}

}
