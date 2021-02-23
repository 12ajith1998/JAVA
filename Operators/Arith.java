
import java.util.Scanner;

public class Arith {
	public  void add()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter A value:");
    	int a=sr.nextInt();
    	System.out.println("Enter B value:");
    	int b=sr.nextInt();
		
		int sum=a+b;
		System.out.println("Sum: "+sum);
	}
	public void sub()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter A value:");
    	int a=sr.nextInt();
    	System.out.println("Enter B value:");
    	int b=sr.nextInt();
	
		int sum=a-b;
		System.out.println("sub: "+sum);
	}
	public void mul()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter A value:");
    	int a=sr.nextInt();
    	System.out.println("Enter B value:");
    	int b=sr.nextInt();
	
		int sum=a*b;
		System.out.println("mul: "+sum);
	}
	public void div()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter A value:");
    	int a=sr.nextInt();
    	System.out.println("Enter B value:");
    	int b=sr.nextInt();

		int sum=a/b;
		System.out.println("div: "+sum);
	}
    public static void main(String[] args) 
    { 
    	Arith op=new Arith();
    	
    	System.out.println("1.ADDITION");
    	System.out.println("2.SUBTRACTION");
    	System.out.println("3.MULTIPLICATION");
    	System.out.println("4.DIVISION");
    	Scanner sc =new Scanner(System.in);
    	int opp=sc.nextInt();
    	switch(opp)
    	{
		case 1:op.add();
    	break;
    	case 2:op.sub();
    	break;
    	case 3:op.mul();
    	break;
    	case 4:op.div();
    	break;
    	default:System.out.println("enter crtly!");
    	
    	}

    	
        
    }
}
