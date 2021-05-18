
import java.util.Scanner;

public class MiddleVal {

	public static void main(String args[]) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string: ");
	String s=sc.nextLine();
	
	System.out.println("The middle value:"+ middle(s)+"\n");
	}
	public static String middle(String s)
	{
		int position;
		int length;
		if(s.length()%2==0)
		{
			position=s.length()/2-1;
			length=2;
		}else
		{
			position=s.length()/2;
			length=1;
		}
		return s.substring(position,position+length);
		
	}
}
