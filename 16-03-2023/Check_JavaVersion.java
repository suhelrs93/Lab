/* Q.5 Write a Java program to check whether Java is installed on your computer. 
Expected Output

Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: . */

class Check_JavaVersion {
 public static void main(String[] args) {
	 System.out.println("\nJava Version: " + System.getProperty("java.version"));
	 System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
	 System.out.println("Java Home: " + System.getProperty("java.home"));
	 System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
	 System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
	 System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
	 
	 /*  			OR
	 System.out.println("Java Version: 19.0.1");
	 System.out.println("Java Runtime Version: 19.0.1+10-21");
	 System.out.println("Java Home: C:\\Program Files\\Java\\jdk-19");
	 System.out.println("Java Vendor: Oracle Corporation");
	 System.out.println("Java Vendor URL: https://java.oracle.com/");
	 System.out.println("Java Class Path: .");
	 */
 }
}