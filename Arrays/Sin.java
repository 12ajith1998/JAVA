import java.util.Scanner;

public class Sin {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array elements: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];

		System.out.println("Enter "+n+" Elements: ");
		
		for (int i = 0; i < n; i++) 
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		
		
	}

}
