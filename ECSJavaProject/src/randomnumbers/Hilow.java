package randomnumbers;
import java.util.Random;
import java.util.Scanner;
public class Hilow 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		 Scanner keyboard= new Scanner(System.in);
		int x = 1 + r.nextInt(100),y;
		
		
		System.out.println("I am thinking of a number between 1-100. Try to guess it.");
		y=keyboard.nextInt();
		if(x>y)
		{
			System.out.println("Sorry, you are too low. I was thinking of "+x);
		}
		
		if(y>x)
		{
			System.out.println("Sorry, you are too high. I was thinking of "+x);
		}
	
		if(x==y)
		{
			System.out.println("You guessed it! What are the odds?");
		}
	
	}	
}
