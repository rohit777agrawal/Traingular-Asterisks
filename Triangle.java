import java.util.Scanner;

/*
Program for Compound Interest.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW10.
Last Changed: March 30, 2018.
*/

public class Triangle {
	
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		int size = 0;
		System.out.println("Enter the size of Triangle (an integer from 1 to 50)");
		Scanner keyboard = new Scanner(System.in);
		
		size = keyboard.nextInt(); // take input 
		
		if (size>=1 && size<= 50) // size should be between 1-50, otherwise invalid!
		{
			for (int line = 1; line<=size; line++)  // line size till the middle section. (includes middle section)
			{	
				
				for(int dot = 1; dot<=line; dot++) // control each line size.
				{
					System.out.print("*");
						
				}
					System.out.print("\n");
			}	
			
			for (int line1 =size-1; line1>=1; line1--) // line size after middle section.
			{
				for (int dot1 = 1; dot1<=line1; dot1++) // control each line size.
				{
					System.out.print("*");
				}
			
					System.out.print("\n");
			}
			
		}
		else
		{
			System.out.println("Invaid number!"); 
		}
		
			
		
	}

}
