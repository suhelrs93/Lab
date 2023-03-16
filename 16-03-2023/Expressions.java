// Q.4 Write a Java program to find the value of specified expression.

// a) 101 + 0) / 3
// b) 3.0e-6 * 10000000.1
// c) true && true
// d) false && true
// e) (false && false) || (true && true)
// f) (false || false) && (true && true)

class Expressions{

public static void main( String args[]){

System.out.println("Exp. a): (101 + 0) / 3 = " + (101 + 0) / 3);
System.out.println("Exp. b): 3.0e-6 * 10000000.1 = " + 3.0e-6 * 10000000.1);
System.out.println("Exp. c): true && true = " + (true && true));
System.out.println("Exp. d): false && true = " + (false && true));
System.out.println("Exp. e): (false && false) || (true && true) = " + ((false && false) || (true && true)));
System.out.println("Exp. f): (false || false) && (true && true) = " + ((false || false) && (true && true)));
}

}