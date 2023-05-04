package lab8;
//class for providing custom runtime exception
public class EmployeeNameInvalidException extends RuntimeException{
	//parameterized constructor
	public EmployeeNameInvalidException(String message)
	{
		super(message); // super() method referring to parent class
	}
}
