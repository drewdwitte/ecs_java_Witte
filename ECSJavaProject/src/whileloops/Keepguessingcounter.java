package whileloops;
import java.util.Scanner;
import java.util.Random;
public class Keepguessingcounter 
{
	public static void main(String[] args)
	{
	Random r = new Random();
	 
	int x = 1 + r.nextInt(10),y;
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	 
	 System.out.print("Your guess: ");
	 y=keyboard.nextInt();
	 
	 do
	 {
		 System.out.println("That is incorrect. Guess again.");
		 System.out.print("Your guess: ");
		 y=keyboard.nextInt();
	 } while(x!=y);
	 System.out.println("That's right! You're a good guesser. It only took you "+y+" tries");
	
	}
}
