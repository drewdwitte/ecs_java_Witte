package whileloops;

import java.util.Random;
import java.util.Scanner;

public class HiLowLimited 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		 Scanner keyboard= new Scanner(System.in);
		int x = 1 + r.nextInt(100),y,tries;
		tries=0;
	
	
		System.out.println("I am thinking of a number between 1-100. You have seven guesses.");
		
		
		System.out.print("Guess #"+(tries+=1)+": ");
		y=keyboard.nextInt();
		while (tries<7)
		{
			if(x>y)
			{
				System.out.println("Sorry, you are too low.");
			
			System.out.print("Guess #"+(tries+=1)+": ");
			y=keyboard.nextInt();
			}
			
			if(y>x&&tries<7)
			{
				System.out.println("Sorry, you are too high.");
				System.out.print("Guess #"+(tries+=1)+": ");
				y=keyboard.nextInt();
			}
	

			if(x==y)
			{
				System.out.println("You guessed it! What are the odds?");
			}
		
		}
		if(tries==7)
		{
			System.out.println("You didn't guess it in seven tries. you lose");
		}
	
	}	
}
