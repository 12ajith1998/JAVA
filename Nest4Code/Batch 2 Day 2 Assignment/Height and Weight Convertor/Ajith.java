import java.util.Scanner;

public class Ajith {
	public static void main(String[] args)
	{
		int Feet;
		int Inch;
		int kg;
		
		int feetinch;
		double feetresult;
		double inchcal;
		
		double height;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Feet: ");
		Feet = sc.nextInt();
		
		System.out.println("Inch: ");
		Inch = sc.nextInt();
		
		System.out.println("kg: ");
		kg = sc.nextInt();
		
		feetinch = Feet*12;//one foot is 12 inch
		feetresult=feetinch*2.54;
		
		inchcal = Inch*2.54;//1 inch is 2.54cm
		
		height=feetresult+inchcal;
		
		System.out.println("Height in cm: "+height);
		
		weight=kg*2.2;//one kg is 2.2 pounds
		System.out.println("Weight in pounds: "+weight);
		
	}
	
}
