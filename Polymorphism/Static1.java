class Multiply1 
{ 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 
	static int Multiply(int a, int b, int c) 
	{ 
		return a * b * c; 
	} 
} 

class Static1 { 
	public static void main(String[] args) 
	{ 
		System.out.println(Multiply1.Multiply(2, 4)); 

		System.out.println(Multiply1.Multiply(2, 7, 3)); 
	} 
} 
