import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int	n=sc.nextInt();
		int r,s=0;
		int t=n;
		
		while(n>0)
		{
			/*
			 * n=123     
			 */
			r=n%10;  // 3
			n=n/10;  // 12
			s=s*10+r; //3
			//321
//			System.out.println(s);
			
		}
		if(t==s)
		{
			System.out.println(" Palindrome");
		}else
		{
			System.out.println(" Not Palindrome");
		}
		
		
	}
}
