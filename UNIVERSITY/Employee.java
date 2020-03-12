package university;

import java.util.Scanner;

public class Employee extends Person
{
 double Salary;
 String desgn;
 String dept;
 public void getDetail()
 {
	 super.getDetails();
	 Scanner input1=new Scanner(System.in);
	 System.out.println("Enter the professional Details");
	 System.out.println("Enter the Department");
	 dept=input1.nextLine();
	 System.out.println("Enter the Designation");
	 desgn=input1.nextLine();
	 System.out.println("Enter the Salary");
	 Salary=input1.nextInt();
	 showDetail();
 }
 public void showDetail()
 {
	 System.out.println("The details entered are:\n");
	 System.out.println("FirstName:"+super.firstName);
	 System.out.println("lastName:"+super.lastName);
	 System.out.println("Age:"+super.age);
	 System.out.println("Department:"+dept);
	 System.out.println("Designation:"+desgn);
	 System.out.println("Salary:"+Salary);
 }
}
