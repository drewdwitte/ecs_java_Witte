package forloops;

public class FizzBuzz 
{
	public static void main(String[] args)
	{
		int n;
		String fizz;
		
		for(n=1;n<=100;n=n+1)
		{
			if(n%3==0)
			{
				
				
				System.out.print("Fizz");
			}
			
			if(n%5==0)
			{
				System.out.print("Buzz ");
			}
			
			
			System.out.println(n);
			
			
		}
		
	}
	
}
