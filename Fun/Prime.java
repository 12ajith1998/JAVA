
public class Prime {

	public static void main(String[] args) 
	{
		int num=2;
		boolean isprime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("Prime Number");
		}
		
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
