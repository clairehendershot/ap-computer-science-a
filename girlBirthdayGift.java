
public class girlBirthdayGift 
{
	// instructions
	// starts with $10 on 12th birthday, $10 will double every year until it gets to $1000
	// print age at last amount and that last amount 
	
	public static void main(String[] args)
	{
		// set starting amount at $10
		// set starting age at 12 years old 
		// set limit at $1000
		int amount = 10; 
		int age = 12;
		int limit = 1000;
		
		// finds amount and age for the first year that the gift amount exceeds $1000
		while (amount < limit)
		{	
			// adds 1 to age
			// doubles amount
			age++;
			amount *= 2;
		}
		
		// goes back one year
		age--;
		amount = amount/2;
		
		// print age at last amount and that last amount
		System.out.println("Age at last amount: " + age + " years old" + "\nLast amount: $" + amount);
	}
}
