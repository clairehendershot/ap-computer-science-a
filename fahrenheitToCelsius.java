import java.text.DecimalFormat;

public class fahrenheitToCelsius 
{      
	// plan
	// create table: 
	// row1 = temp in farenheit (start at 20, increase by 3, use for loop)
	// row2 = temp in celsius (need to convert from f, celsius = (5.0/9.0)*(fahrenheit – 32)
	// 20 columns 
	
	public static void main(String[] args)
	{
		// print titles to console
		System.out.println("Fahrenheit\tCelsius");
		
		// assign starting value to the fahrenheit and celsius variables
		double fahrenheit = 20;
		double celsius = 0;
		
		// loops the program 20 times 
		for (int i = 0; i < 20; i++)
		{
			// multiples i by 3 because increasing by 3 degrees every loop
			// adds 3 to fahrenheit everytime loop is run
			// calculates celsisus off new fahrenheit
			i *= 3;
			fahrenheit += i;
			celsius = (5.0/9.0)*(fahrenheit - 32);
			
			// formats celsius to have one decimal place
			String pattern = "#######.0";
			DecimalFormat numberFormat = new DecimalFormat(pattern);
			
			// prints fahrenheit and celsius values to the console 
			System.out.println(fahrenheit + "\t\t" + numberFormat.format(celsius));
			
			// resets i
			i /= 3;
		}
	}
}
