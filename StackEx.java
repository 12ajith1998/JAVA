package MyPac;


public class StackEx {

	public static void main(String[] args) 
	{
		Stack st=new Stack();
		st.push(12);
		st.push(1);
		st.push(56);
		st.push(33);
		st.push(89);
//		st.push(56);
		
		st.pop();
		st.size();
		st.peek();
		st.isempty();
		st.show();
	}
}
class Stack
{
	int stack[]=new int[5];
	int top=0;
	public void push(int data)
	{
		if(top==5)
		{
			System.out.println("Stack is full");
		}else
		{
		stack[top]=data;
		top++;
		}
	}
	public void pop()
	{
		int data;
		if(isempty())
		{
			System.out.println("stack is empty");
		}else {
		top--;
		data=stack[top];
		stack[top]=0;
		System.out.println(data+" pop");
		}
		
	}
	public void peek()
	{
		int data;
		top--;
		data=stack[top];
		System.out.println(data+" peek");
	}
	public int size()
	{
		return top;
	}
	public boolean isempty()
	{
		return top<=0;
		
	}
	public void show()
	{
		for(int i:stack)
			System.out.println(i);
	}
	
}
