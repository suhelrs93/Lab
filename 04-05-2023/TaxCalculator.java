package lab8;

public class TaxCalculator { //class
	
	//parameterized method - it will return Tax Amount or Some Specified exceptions
	public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		double taxAmount;//local variable
		// Actual business logic for calculating tax and returning Tax Amount or Exceptions
		if (isIndian==true && empName!=null)
		{
			if(empSal>100000)
			{
				taxAmount = empSal*8/100; // returns 8% tax amount
				return taxAmount;
			}
			else if(empSal>50000 && empSal<=100000)
			{
				taxAmount = empSal*6/100; // returns 6% tax amount
				return taxAmount;
			}
			else if(empSal>30000 && empSal<=50000)
			{
				taxAmount = empSal*5/100; // returns 5% tax amount
				return taxAmount;
			}
			else if(empSal>=10000 && empSal<=30000)
			{
				taxAmount = empSal*4/100; // returns 4% tax amount
				return taxAmount;
			}
			else //throwing exception - no Tax
			{
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
		}
		else if(isIndian==false) // if not Indian then throwing Exception
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		else // else part will throw Exception for empty(null) Employee Name
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
	}
}
