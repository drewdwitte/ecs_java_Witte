package selectionstructures;
import java.util.Scanner;
public class BMICalcBetter 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int feet,pounds, inches;
		double BMI;
	
		
		System.out.print("How many feet tall are you? ");
		feet=keyboard.nextInt();
		
		System.out.print("How many inches? ");
		inches=keyboard.nextInt();
		
		
		System.out.print("How many pounds do you weigh? ");
		pounds=keyboard.nextInt();
		
		BMI=(pounds*.4536)/(((feet+inches/12) *.3048*((feet+inches/12) *.3048)));
		System.out.println("Your BMI is: "+BMI);
		
	
			if(BMI<18.5)
		{
			System.out.println("You are underweight");
		}
		
			else if(18.5<BMI&&BMI<24.9)
		{
			System.out.println("You are normal weight");
		}
			else if(25<BMI&&BMI<29.9)
			{
				System.out.println("You are overweight");
			}
			
			else if(30.0<BMI)
			{
				System.out.println("You are obese");
			}
	}
}
