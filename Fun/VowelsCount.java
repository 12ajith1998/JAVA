import java.util.Scanner;

public class VowelsCount {

	public static void main(String args[]) {
	int sum=0;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string: ");
	String s=sc.nextLine();
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
		{
			sum++;
		}
	}
	System.out.println(sum);
	}
}
