import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ajith {
	public static void main(String[] args)
	{
       	Scanner input = new Scanner (System.in);
       	System.out.println("Enter the time in seconds:");
	    int seconds=input.nextInt();
         int day = (int)TimeUnit.SECONDS.toDays(seconds);        
         long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
         long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
         long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

         System.out.println(day + " Days " + hours +" Hours " + minute +" Minutes " + second+" Seconds ");

	}


   
}
