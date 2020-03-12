package university;

import java.util.Scanner;

public class Student extends Person
{
String university;
String stream;
int studentId;
public void getDetail()
{
	 super.getDetails();
	 Scanner input2=new Scanner(System.in);
	 System.out.println("Enter the Academic Details");
	 System.out.println("Enter the course enrolled");
	 stream=input2.nextLine();
	 System.out.println("Enter the Student ID");
	 studentId=input2.nextInt();
	 showDetail();
}
public void showDetail()
{
	 System.out.println("The details entered are:\n");
	 System.out.println("FirstName:"+super.firstName);
	 System.out.println("lastName:"+super.lastName);
	 System.out.println("Age:"+super.age);
	 System.out.println("course Enrolled:"+stream);
	 System.out.println("student ID:"+studentId);
}
}
