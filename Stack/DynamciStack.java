package MyPac;


public class DynamciStack {

	public static void main(String[] args) 
	{
		Stack st=new Stack();
		st.push(12);
		st.push(1);
		st.push(56);
		st.push(33);
		st.push(89);
		st.push(56);
		
		st.pop();
		st.pop();
		st.pop();
//		st.size();
//		st.peek();
//		st.isempty();
		st.show();
	}
}
class Stack
{
	int capacity=2;
	int stack[]=new int[capacity];
	int top=0;
	public void push(int data)
	{
		if(size()==capacity) {
			expand();}
		stack[top]=data;
		top++;
	}
	private void expand() {
		int length=size();
		int newstack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack=newstack;
		capacity *=2;
	}
	public void pop()
	{
		int data;
		if(isempty())
		{
			System.out.println("stack is empty");
		}else 
		{
			top--;
			data=stack[top];
			stack[top]=0;
			System.out.println(data+" pop");
			shrink();
		}
		
	}
	private void shrink() {
		int length=size();
		if(length<=(capacity/2)/2)
		{
			capacity=capacity/2;
		}
		int newstack[]=new int[capacity];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack=newstack;
		
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
