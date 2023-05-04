package lab8;
// class for providing custom runtime exception
public class CountryNotValidException extends RuntimeException{
	//parameterized constructor
	public CountryNotValidException(String message)
	{
		super(message); // super() method referring to parent class
	}
}
