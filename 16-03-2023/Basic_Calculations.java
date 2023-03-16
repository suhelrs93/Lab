// Q.2 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

class Basic_Calculations{

public static void main(String args[]){

int a = 13;
int b = 5;

System.out.println("The Two Numbers are :  " );
System.out.println(a + " " + b);

int sum=a+b;
System.out.println("Addition = " + sum);
int sub=a-b;
System.out.println("Substraction = " + sub);
int mult=a*b;
System.out.println("Multiplication = " + mult);
int div=a/b;
System.out.println("Division = " + div);
int mod=a%b;
System.out.println("Reminder = " + mod);

}
}