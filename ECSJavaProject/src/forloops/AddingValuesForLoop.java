package forloops;
import java.util.Scanner;
public class AddingValuesForLoop 
{
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		
		int x,n,sum;
	
	
		System.out.print("Number: ");
			n=keyboard.nextInt();
			
			sum=0;
			
			
			for(x=1;x<=n;x=x+1) 
			{
				System.out.print(x+" ");
				sum=sum+x;
			}
			
			
			
			System.out.println("The sum is  "+sum);
		
			
	}
	
}
