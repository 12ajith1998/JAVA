import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one11 
{ 
	public void print_A() 
	{ 
		System.out.println("JAVA"); 
	} 
} 

class two22 extends one11 
{ 
	public void print_B() 
	{ 
		System.out.println("----"); 
	} 
} 

class three33 extends one11 
{ 
	/*............*/
} 
public class Hierarchical  
{ 
	public static void main(String[] args) 
	{ 
		three33 g = new three33(); 
		g.print_A(); 
		two22 t = new two22(); 
		t.print_B(); 
		g.print_A(); 
	} 
} 
