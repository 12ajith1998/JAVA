import java.util.Scanner;

public class Swap {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap \nA value: "+a+"\nB value: "+b);
		
//		int temp=a;
//		a=b;
//		b=temp;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap \nA Value: "+a+"\nB value: "+b);
		
	}
}
