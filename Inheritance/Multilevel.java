 import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one1 
{ 
	public void print_A() 
	{ 
		System.out.println("ALL"); 
	} 
} 

class two2 extends one1 
{ 
	public void print_B() 
	{ 
		System.out.println("IS"); 
	} 
} 

class three3 extends two2 
{ 
	public void print_C() 
	{ 
		System.out.println("WELL"); 
	} 
} 

public class Multilevel 
{ 
	public static void main(String[] args) 
	{ 
		three3 g = new three3(); 
		g.print_A(); 
		g.print_B(); 
		g.print_C(); 
	} 
} 
