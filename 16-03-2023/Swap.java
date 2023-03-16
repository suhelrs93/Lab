// Q.3 Write a Java program to swap two variables.

class Swap{

public static void main( String args[]){

int a = 13;
int b = 5;

System.out.println("Value of A is :  "+ a);
System.out.println("Value of B is :  "+ b);
System.out.println();// For blank Line

int temp=a;
a=b;
b=temp;

System.out.println("After Swaping");
System.out.println();// For blank Line

System.out.println("Value of A is :  "+ a);
System.out.println("Value of B is :  "+ b);

}

}