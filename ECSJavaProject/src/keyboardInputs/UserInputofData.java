package keyboardInputs;

import java.util.Scanner;

public class UserInputofData {
	public static void main (String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	String name,lastname,login;
	int  grade,studentid;
	double gpa;
	
	System.out.print("First name: ");
	name = keyboard.next();
	
	System.out.print("Last name: ");
	lastname= keyboard.next();
	
	System.out.print("Grade (9-12): ");
	grade= keyboard.nextInt();
	
	System.out.print("Student ID:  ");
	studentid= keyboard.nextInt();
	
	System.out.print("Login:  ");
	login= keyboard.next();
	
	System.out.print("GPA (0.0-4.0:  ");
	gpa= keyboard.nextDouble();
	
	
	System.out.println(" ");
	System.out.println("Your Information:  ");
	System.out.println("Login:  "+login);
	System.out.println("ID:  "+studentid);
	System.out.println("Name:  "+lastname+", "+name);
	System.out.println("GPA:  "+gpa);
	System.out.println("Grade:  "+grade);
	
	keyboard.close();
	
	}
}
