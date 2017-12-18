package methods;
import java.util.Scanner;
public class AreaCalculator 
{

	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		
		
		
		System.out.println("Shape Area Calculator (c) 2017 Drew Witte ECS");
		System.out.println("----------------------------------------------");	
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");	
		System.out.print("Which Shape: ");
		 int shape=keyboard.nextInt();
	
		if(shape==1)
		{
			System.out.print("Base: ");
			int base=keyboard.nextInt();
			System.out.println("");
			
			System.out.print("Height: ");
			int height=keyboard.nextInt();
			
			 double trarea=height*base*.5;
			
			System.out.println("The area is "+trarea);
		}
		
			
		if(shape==2)
		{
			System.out.print("Length: ");
			int width=keyboard.nextInt();
			System.out.println("");
			
			System.out.print("Width: ");
			int length=keyboard.nextInt();
			
			 double recarea=width*length;
			
			System.out.println("The area is "+recarea);
			System.out.println("Goodbye!!! ");
		}
	
	
	
		
		if(shape==3)
		{
			System.out.print("Side: ");
			int Side=keyboard.nextInt();
			System.out.println("");
			
			
			
			 double sqcarea=Side*Side;
			
			System.out.println("The area is "+sqcarea);
			System.out.println("Goodbye!!! ");
		}
		
		
		
		
		if(shape==4)
		{
			System.out.print("Radius: ");
			int rad=keyboard.nextInt();
			System.out.println("");
			
			
			
			 double rcarea=rad*rad*3.14;
			
			System.out.println("The area is "+rcarea);
			System.out.println("Goodbye!!! ");
		}
	
		if(shape==4)
		{
			
			System.out.println("Goodbye!!! ");
		}
		
	}
	
	
	
}
		
		
			
		 
	
	
	
	
	
	

