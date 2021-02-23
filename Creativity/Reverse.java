package my_package;

import java.util.Scanner;

public class Reverse {
	
    public static void main(String[] args) 
    { 
    
    	System.out.println(" ");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i=1;i<=n;i++)
    	{
    		System.out.print("  "+i);
    	}
   	    System.out.println(" ");
   	
   	    for(int j=n;j>=1;j--)
   	    {
   	    	System.out.print("  "+j);
   	    }
    	
    }
}
