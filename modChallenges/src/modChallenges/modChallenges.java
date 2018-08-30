package modChallenges;

import java.util.Scanner;
public class modChallenges
	{
		public static void main(String[] args)
		{
		// leapYear ();
		System.out.println();
		fizzBuzz ();
		}
				public static void leapYear ()	
				{
						Scanner userInput = new Scanner (System.in);
						System.out.println("Type in a year to see if it is a leap year");
						int userYear = userInput.nextInt();
							
							if ((userYear%4 == 0)&&(userYear%100 == 0)&&(userYear%400 == 0))
								{
									System.out.println(userYear + " is a leap year.");
								}
							else
								{
									System.out.println(userYear + " is not a leap year.");
								}
				}		
				public static void fizzBuzz ()
				{
							for (int i = 1; i <= 100; i++)
								{
									System.out.println(i);
									if ((i%3 == 0)&&(i%5 == 0))
										{	
											System.out.println("FizzBuzz");
										}
									else if(i%3 == 0) 
										{
											System.out.println("Fizz");
										}
									else if (i%5 == 0)
										{
											System.out.println("Buzz");
										} 
									else 
										{
											System.out.println(i);
										}
								}
				}		
		
	}
				

	
