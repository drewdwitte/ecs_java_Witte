package selectionstructures;
import java.util.Scanner;
public class ALittleQuiz 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int answer;
		
		System.out.println("Q1) What is the capital of New York? ");
		System.out.println("1) Melbourne ");
		System.out.println("2) Albany ");
		System.out.println("3) New York City");
		answer=keyboard.nextInt();
		
		if(answer==2)
		{
			System.out.println("That's Right!");
		}
		else
		{
			System.out.println("Sorry, the correct answer is Albany!");
		}
		

		System.out.println("Q1) What year is it? ");
		System.out.println("1) 1995");
		System.out.println("2) 2017 ");
		System.out.println("3) 217");
		answer=keyboard.nextInt();
		
		if(answer==2)
		{
			System.out.println("That's Right!");
		}
		else
		{
			System.out.println("Sorry, the correct answer is 2017!");
		}
		
		System.out.println("Q1) Where is San Diego ");
		System.out.println("1) New York");
		System.out.println("2) Iraq");
		System.out.println("3) California");
		answer=keyboard.nextInt();
		
		if(answer==3)
		{
			System.out.println("That's Right!");
		}
		else
		{
			System.out.println("Sorry, the correct answer is California!");
		}
		
		System.out.println("Overall, you got "+answer+" out of 3 correct.");
		System.out.println("Thanks for Playing");
	}
}
