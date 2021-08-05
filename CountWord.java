import java.util.*;
public class CountWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String test=sc.nextLine();
		count(test);
	}
	public static void count(String x)
	{
		char[] s=x.toCharArray();
		int letter=0;
		int space=0;
		int number=0;
		int others=0;
		for(int i=0;i<x.length();i++)
		{
			if(Character.isLetter(s[i]))
			{
				letter++;
			}else if(Character.isDigit(s[i]))
			{
				number++;
			}else if(Character.isSpace(s[i]))
			{
				space++;
			}else
			{
				others++;
			}
			
		}
		System.out.println("letter"+letter);
		System.out.println("space"+space);
		System.out.println("number"+number);
		System.out.println("others"+others);
	}
}
