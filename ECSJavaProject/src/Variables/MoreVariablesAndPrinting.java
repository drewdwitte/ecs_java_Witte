package Variables;

public class MoreVariablesAndPrinting 
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double myCent, myKg;
		
		myName="Drew Witte";
		myAge=17; //not a lie
		myWeight= 165; //lbs
		myHeight=75;//inches
		myEyes="Blue";
		myTeeth="White";
		myHair="Blonde";
		myCent=190.5;
		myKg=74.84;		
		
		System.out.println("Let's talk about "+myName+".");
		System.out.println("He's "+myHeight+"inches (or "+myCent+"cm) tall.");
		System.out.println("He's "+myWeight+"pounds (or "+myKg+"kg) heavy");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got "+myEyes+" eyes and "+myHair+"hair.");
		System.out.println("His teeth are usually"+myTeeth+" depending on the coffee.");
		
		System.out.println("If I add "+myAge+","+myHeight+",and "+myWeight+" I get "+(myAge+myHeight+myWeight)+"." );
	}
	
	
}
