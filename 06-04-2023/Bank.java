/* Q3. Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
 * However, the rate of interest varies according to banks.
 * For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
 */
package lab4;

public class Bank { // parent class
	float getRateOfInterest() { // method of parent class
		return 0;
	}
	
	public static void main(String[] args) { // main method
		// creating objects
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		// method calls
		System.out.println("Interest of SBI Bank: "+s.getRateOfInterest()+"%");
		System.out.println("Interest of ICICI Bank: "+i.getRateOfInterest()+"%");
		System.out.println("Interest of AXIS Bank: "+a.getRateOfInterest()+"%");
	}
}
class SBI extends Bank{ // child class 1
	@Override
	float getRateOfInterest() { // override method
		return 8f;
	}
}
class ICICI extends Bank{ // child class 2
	@Override
	float getRateOfInterest(){ // override method
		return 7f;
	}
}
class AXIS extends Bank{ // child class 3
	@Override
	float getRateOfInterest(){ // override method
		return 9f;
	}
}
