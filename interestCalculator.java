import java.text.DecimalFormat;

public class interestCalculator 
{
	// plan
	// starting value = 1000; interest = 8% 
	// total = starting value + starting value * 0.08
	// ten years
	// must display year (0-10); amount in bank account
	
	public static void main(String[] args)
	{
		// print titles to console
		System.out.println("Year\tAmount");
		
		// set starting bank account amount
		// set interest rate
		double amount = 1000; 
		double interest = 0.08;
		
		// formats amount to have one decimal place
		String pattern = "#######.00";
		DecimalFormat numberFormat = new DecimalFormat(pattern);
		
		// prints starting amount
		System.out.println(0 + "\t$" + numberFormat.format(amount));
		
		// loops the program 10 times (1-10)
		for (int i = 1; i < 11; i++)
		{	
			// calculates new amount based on amount in the previous year and set interest rate
			amount = amount + amount*interest;
			
			// prints year and new amount to console
			System.out.println(i + "\t$" + numberFormat.format(amount));
		}
	}
	
}
