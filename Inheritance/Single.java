import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
	public void print_A() 
	{ 
		System.out.println("Ajith1"); 
	} 
} 

class two extends one 
{ 
	public void print_B() 
	{ 
		System.out.println("Ajith2"); 
	} 
} 
public class Single 
{ 
	public static void main(String[] args) 
	{ 
		two g = new two(); 
		g.print_A(); 
		g.print_B(); 
		g.print_A(); 
	} 
} 
