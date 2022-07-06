import java.util.Scanner;

public class reversePositiveInteger 
{
	public static void main(String[] args)
	{
		// takes user inputed number and assigns the number to an integer variable
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer you would like to invert: ");  
		int num = sc.nextInt();  
		
		// sets a variable for the inverted number
		String invertedNumber = "";
		
		// repeats program until the number is 0
		do
		{
			// finds the digit in the 10s place
			// converts this digit to a string
			// adds this new string to the inverted number variable 
			int digit = num%10;
			String digitAsString = String.valueOf(digit);
			invertedNumber = invertedNumber.concat(digitAsString);
			
			// redefines num by taking the digit in the 10s place off
			num = num/10;
		} 
		while (num != 0);
		
		// prints inverted number to console
		System.out.println("Here is the inverted integer: "+ invertedNumber);
		
	}
}
