package forloops;
import java.util.Scanner;
public class CountingMachineRevisited 
{
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		
		System.out.print("Count from: ");
		int x=keyboard.nextInt();
		System.out.print("Count to: ");
		int v=keyboard.nextInt();
		System.out.print("Count by: ");
		int y=keyboard.nextInt();
		
		for(int n=x;x<=v;x=x+y)
		{
			System.out.print(x+" ");
		}
	}
}
