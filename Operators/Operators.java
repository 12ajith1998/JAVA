package operator;

import java.util.Scanner;

public class Operators 
{
 public void Arithmetic()
 {
	 int X,Y;
	System.out.println("Enter the value of X:");
	Scanner ar=new Scanner(System.in);
	X=ar.nextInt();
	System.out.println("Enter the value of Y:");
	Y=ar.nextInt();
	System.out.println("Add:"+(X+Y));
	System.out.println("Sub:"+(X-Y));
	System.out.println("Mul:"+(X*Y));
	System.out.println("Div:"+(X/Y));
	System.out.println("Mod:"+(X%Y));
	System.out.println("X++:"+(X++));
	System.out.println("++X:"+(++X));
	System.out.println("Y++:"+(Y++));
	System.out.println("++Y:"+(++Y));
 }
 public void Assignment()
 {
	 // Declaring variables 
     int num; 
     String name; 
     // Assigning values 
     num = 07; 
     name = "AJITH KUMAR"; 
     System.out.println("num is assigned: " + num); 
     System.out.println("name is assigned: " + name); 
	 
 }
 public void Unary()
 {
	 int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
     boolean condition = true; 
     c = ++a; 
     System.out.println("Value of c (++a) = " + c); 
     c = b++; 
     System.out.println("Value of c (b++) = " + c); 
     c = --d; 
     System.out.println("Value of c (--d) = " + c); 
     c = e--; 
     System.out.println("Value of c (e--) = " + c); 
  
 }
 public void Logical()
 {
	 String x = "ajith"; 
     String y = "kumar"; 

     Scanner s = new Scanner(System.in); 
     System.out.print("Enter username:"); 
     String userid = s.next(); 
     System.out.print("Enter password:"); 
     String userpassword = s.next(); 

     // Check if user-name and password match or not. 
     if ((userid.equals(x) && userpassword.equals(y)) 
         || (userid.equals(y) && userpassword.equals(x))) { 
         System.out.println("Welcome BaBy@@@@@@@@@@!!!!!"); 
     } 
     else
     { 
         System.out.println("please enter correct password or UserID"); 
     }
 }
 public void Bitwise()
 {
	 int a = 0x0005; 
     int b = 0x0007; 
     System.out.println("a&b = " + (a & b)); 
     System.out.println("a|b = " + (a | b)); 
     System.out.println("a^b = " + (a ^ b)); 
     System.out.println("~a = " + ~a); 
     a &= b; 
     System.out.println("a= " + a); 
 }
 public void Relational()
 {
	 int a = 20, b = 10; 
     String x = "Thank", y = "Thanks"; 
     int ar[] = { 1, 2, 3 }; 
     int br[] = { 1, 2, 3 }; 
     boolean condition = true; 

     System.out.println("a == b :" + (a == b)); 
     System.out.println("a < b :" + (a < b)); 
     System.out.println("a <= b :" + (a <= b)); 
     System.out.println("a > b :" + (a > b)); 
     System.out.println("a >= b :" + (a >= b)); 
     System.out.println("a != b :" + (a != b)); 
     System.out.println("x == y : " + (ar == br)); 
     System.out.println("condition==true :"+ (condition == true)); 
 }
 public void Ternary()
 {
	 int a = 20, b = 10, c = 30, result; 
     result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c); 
     System.out.println("Max of three numbers = "+ result); 
 }
 public void Shift()
 {
	 int a = 0x0005; 
     int b = -10; 

     // left shift operator 
     System.out.println("a<<2 = " + (a << 2)); 

     // right shift operator 
     System.out.println("a>>2 = " + (a >> 2)); 
     // unsigned right shift operator 
     System.out.println("b>>>2 = " + (b >>> 2)); 
 }
 public void Precedence_and_associativity()
 {
	 int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
	  
     System.out.println("a+b/d = " + (a + b / d));  
     System.out.println("a+b*d-e/f = "+ (a + b * d - e / f)); 
 }
 public static void main(String args[])
 {
	 int a;
	 Operators op=new Operators();
	 System.out.println("1.Arithmetic operators");
	 System.out.println("2.Assignment operators");
	 System.out.println("3.Unary operators");
	 System.out.println("4.Logical operators");
	 System.out.println("5.Bitwise operators");
	 System.out.println("6.Relational operators");
	 System.out.println("7.Ternary operators");
	 System.out.println("8.Shift operators");
	 System.out.println("9.Precedence_and_associativity operators");	
	 System.out.println("\nEnter your choice:");
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 switch(a)
	 {
	 case 1:op.Arithmetic();
	 break;
	 case 2:op.Assignment();
	 break;
	 case 3:op.Unary();
	 break;
	 case 4:op.Logical();
	 break;
	 case 5:op.Bitwise();
	 break;
	 case 6:op.Relational();
	 break;
	 case 7:op.Ternary();
	 break;
	 case 8:op.Shift();
	 break;
	 case 9:op.Precedence_and_associativity();
	 break;	
	 default:System.out.println("Enter correct choice:");
	 }
 }
}

