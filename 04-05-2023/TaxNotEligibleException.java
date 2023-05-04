package lab8;
//class for providing custom runtime exception
public class TaxNotEligibleException extends RuntimeException{
	//parameterized constructor
	public TaxNotEligibleException(String message)
	{
		super(message); // super() method referring to parent class
	}
}
