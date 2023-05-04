package lab8;

public class CalculatorSimulator { // main class

	public static void main(String[] args) { // main method
		
		TaxCalculator tax = new TaxCalculator(); // created object of "TaxCalculator" class
		
		// Using try-catch block for Exception Handling
		try
		{
			double taxAmt= tax.calculateTax(null, true, 30000); // passing arguments to parameterized method 
			System.out.println("Tax amount is "+ taxAmt);
		}
		// if exceptions are occurred then it will be handled by catch block
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(CountryNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
/*
 * Outputs:-
 * 
 * ---------- Test Case 1 ----------
 * t.calculateTax("Ron", false, 34000);
 * The employee should be an Indian citizen for calculating tax
 * 
 * ---------- Test Case 2 ----------
 * t.calculateTax("Tim", true, 1000);
 * The employee does not need to pay tax

 * ---------- Test Case 3 ----------
 * t.calculateTax("Jack", true, 55000);
 * Tax amount is 3300.0
 * 
 * ---------- Test Case 4 ----------
 * t.calculateTax(null, true, 30000);
 * The employee name cannot be empty
 *
 */
