class Ajith 
{ 
	Ajith() 
	{ 
		System.out.println("Ajith class Constructor"); 
	} 
} 

class Kumar extends Ajith 
{ 
	Kumar() 
	{ 
		// invoke or call parent class constructor 
		super(); 

		System.out.println("Kumar class Constructor"); 
	} 
} 
class Super_Keyword 
{ 
	public static void main(String[] args) 
	{ 
		Kumar S = new Kumar(); 
	} 
} 
