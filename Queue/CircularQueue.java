package MyPac;


public class CircularQueue {

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(67);
		q.enQueue(7);
		q.enQueue(3);
		q.enQueue(3);
		q.enQueue(3);
		
		q.deQueue();
		q.deQueue();
		System.out.println("size: "+q.getsize());
		System.out.println(q.isempty());
		System.out.println(q.isfull());
		
		q.show();
	}
}
class Queue
{
	int queue[]=new int[5];
	int front=0;
	int rear=0;
	int size=0;
	
	public void enQueue(int data)
	{
		if(!isfull())
		{
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
		}else {
			System.out.println("queue is full");
		}
	}
	public boolean isfull() {
		return size==5;
	}
	public boolean isempty() {
		
		return size==0;
	}
	public int deQueue()
	{
		int data=queue[front];
		if(!isempty())
		{
		front=(front+1)%5;
		size--;
		}else {
			System.out.println("queue is empty");
		}
		return data;
	}
	public int getsize() {
		return size;
	}
	public void show()
	{
		System.out.print("Elements: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
	
}
