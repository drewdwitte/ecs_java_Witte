package methods;
import java.util.Scanner;
public class MethodPass 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Pick a number: ");
		int y= keyboard.nextInt();
		boolean opinion;
		opinion=checking(y);
		
	if(opinion)
	{
		System.out.println("I like that number!");	
	}
	
	else
	{
		System.out.println("That number is gross...");	
		
		
	}
	
	
	}
	
	public static boolean checking(int y)
	{
		boolean opinion;
		
		if(y%3==0)
	opinion=true;
		
		else
			opinion=false;
		
		return opinion;
	}

}
