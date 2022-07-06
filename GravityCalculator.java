import java.text.DecimalFormat;

public class GravityCalculator 
{ 
	public static void main(String[] args)
	{ 
		double gravity = -9.81;
		// earth's gravity in m/s^2
		double initialVelocity = 0.0; 
		double fallingTime = 10.0; 
		double initialPosition = 0.0; 
		double finalPosition = 0.0; 
		
		// the output is: The object's position after 10.0 seconds is 0.0 m
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m"); 
		
		// equation for final position 
		finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
		
		// formated final position with two decimal places (if available) 
		String pattern = "#######.00";
		DecimalFormat numberFormat = new DecimalFormat(pattern);
		
		// new position with calculus equation 
		// the output is: The object's position after 10.0 seconds is -490.500 m 
		System.out.println("The object's position after " + fallingTime + " seconds is " + numberFormat.format(finalPosition) + " m");
	} 	
} 
