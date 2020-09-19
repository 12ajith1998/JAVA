import java.util.Scanner;

public class Ajith {
	public static void main(String[] args)
	{
		double price1;
		double price2;
		double price3;
		double tax;
		double product_price;
		double Tax_amount;
		double Final_amount;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("price1: ");
		price1 = sc.nextDouble();
		
		System.out.println("price2: ");
		price2 = sc.nextDouble();
		
		System.out.println("price3: ");
		price3 = sc.nextDouble();
		
		System.out.println("TAX: ");
		tax = sc.nextDouble();
		
		product_price = price1+price2+price3;
		
		Tax_amount = tax/100*product_price;
		
		Final_amount = Tax_amount+price1+price2+price3;
		
		System.out.println("Final Amount :"+Final_amount);
		
		System.exit(0);
	}
	
}
