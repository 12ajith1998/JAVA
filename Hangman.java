package game;

import java.util.Scanner;
import java.util.*;


public class Hangman 
{
	String word="australia";
  public void showMenu()
  {
	  int option;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("-----------Menu----------");  
	  System.out.println("1.play");  
	  System.out.println("2.Instructions");  
	  System.out.println("3.Exit");  
	  System.out.println("\nChoose the option:");  
      option=sc.nextInt();
      switch(option)
      {
      case 1:playGame();
      break;
      case 2:instructGame();
      break;
      case 3:ExitGame();
      break;
      default : System.out.println("Incorrect menu option");
      showMenu();
      break;
      }
  }
  public void playGame()
  {
	  int i,flag =0;
	  String input;
	  String guess;
	  Scanner ply=new Scanner(System.in);
	  do
	  {
		  System.out.print("\nEnter your Guess:");
		  input =ply.nextLine();
		  for(i=0;i<word.length();i++)
		  {
			  if(word.charAt(i) == input.charAt(0))
			  {
				  flag=1;
			  }
		  }
		  if(flag==1)
		  {
			  System.out.println("This letter is present in the word");
		  }
		  else
		  {
			  System.out.println("This letter is not present in the word");
		  }
		  System.out.println("Do you want to guess again(y/n):");
		  guess=ply.nextLine();
		  flag=0;
	  }
	  while((guess.equals("y"))||guess.equals("Y"));
	  System.out.println("playGame method is invoked"); 
  }
  public void instructGame()
  {
	  System.out.println("instruction method is invoked"); 
  }
  public void ExitGame()
  {
	  System.out.println("ExitGame method is invoked");
  }
  public static void main(String[]args)
  {
	  Hangman hg=new Hangman();
	  hg.showMenu();
	  
  }
}
