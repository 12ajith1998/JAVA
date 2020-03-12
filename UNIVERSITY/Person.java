package university;

import java.util.Scanner;

public class Person 
{
   String firstName;
   String lastName;
   int age;
   
   public void getDetails()
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the Basic Details");
	   System.out.println("Enter the firstName");
	   firstName=input.nextLine();
	   System.out.println("Enter the lastName");
	   lastName=input.nextLine();
	   System.out.println("Enter the Age");
	   age=input.nextInt();
	   
   }
	
}
