package my_package;

import java.util.Scanner;

public class Summ {
	
	public static int sum(int i, int j) {
		int S=i+j;
		return S;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
		int a=sc.nextInt();
		
		System.out.println("");
		int b=sc.nextInt();

		int sum = sum(a, b);
		System.out.println(sum);
    }
}
