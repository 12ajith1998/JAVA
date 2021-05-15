
import java.util.Scanner;


public class PerfectNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int	n=sc.nextInt();
		
		boolean b=isperfect(n);
		if(b)
			System.out.println("perfect number");
		else
			System.out.println("Its Not");
		
	}
	public static boolean isperfect(int n)
	{
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		if(n==sum)
			return true;
				
		return false;
	}
}
