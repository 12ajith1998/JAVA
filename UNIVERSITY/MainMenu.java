package university;

import java.util.Scanner;

public class MainMenu 
{
 public static void main(String[]args)
 {
	 Scanner choice=new Scanner(System.in);
	 System.out.println("Menu");
	 System.out.println("\n1.Student Details");
	 System.out.println("\n2.Emploee Details");
	 System.out.println("\nEnter the choice:");
	 int a=choice.nextInt();
	 switch(a)
	 {
	 case 1:
		 Student st=new Student();
		 st.getDetail();
		 break;
	 case 2:
		 Employee empl=new Employee();
		 empl.getDetail();
		 break;
	 }
 }
}
