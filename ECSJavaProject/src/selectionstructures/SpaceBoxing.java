package selectionstructures;
import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int planet;
		double weight;
		
		System.out.print("Please enter your current earth weight: ");
		weight=keyboard.nextDouble();
		
		System.out.println("I have information on the following planets:");
		System.out.println("1.Venus	 2.Mars	   3.Jupiter");
		System.out.println("4.Saturn 5.Uranus  6.Neptune");
		planet=keyboard.nextInt();
		
		if (planet==1)
		{
			System.out.println("Your weight would be "+(weight*.78)+" pounds on that planet.");
		}
		
		if (planet==2)
		{
			System.out.println("Your weight would be "+(weight*.39)+" pounds on that planet.");
		}
		
		if (planet==3)
		{
			System.out.println("Your weight would be "+(weight*2.65)+" pounds on that planet.");
		}
		
		if (planet==4)
		{
			System.out.println("Your weight would be "+(weight*1.17)+" pounds on that planet.");
		}
		
		if (planet==5)
		{
			System.out.println("Your weight would be "+(weight*1.05)+" pounds on that planet.");
		}
		
		if (planet==6)
		{
			System.out.println("Your weight would be "+(weight*1.23)+" pounds on that planet.");
		}
		
		
	}
}

