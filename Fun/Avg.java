import java.util.Scanner;

public class Avg {

	public static void main(String args[]) {
		
	int a,b;
	int c=1;
	float x,y,z=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value: ");
	a=sc.nextInt();
	while(c<=a)
	{
		System.out.println(" Enter the "+c+" value: ");
		b=sc.nextInt();
		z+=b;
		++c;
	}
	x=z/a;
	System.out.println(x);
	}
}
