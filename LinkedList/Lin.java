package Example;

public class Lin {
	public static void main(String[] args) 
	{
		Node head=new Node(9);
		Node head1=new Node(2);
		Node mid=new Node(3,head1);
		head.next=mid;
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
		head=Add(head,2,5);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
		head=Remove(head,1);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
		head=set(head,2,99);
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	public static Node Remove(Node head,int index)
	{
		if(index==0)
		{
			return head.next;
		}
		Node temp=head;
		for(int i=0;i<index-1 && temp.next.next!=null;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	public static Node Add(Node head,int index,int value)
	{
		
		Node node=new Node(value);
		if(index==0)
		{
			node.next=head;
			
			return node;
		}
		
		Node temp=head;
		for(int i=0;i<index-1 && temp.next!=null;i++)
		{
			temp=temp.next;
		}
		Node next=temp.next;
		temp.next=node;
		node.next=next;
		
		return head;
	}
	public static Node set(Node head,int index,int value)
	{
		
		if(index==0)
		{
			head.val=value;
			
			return head;
		}
		
		Node temp=head;
		for(int i=0;i<index-1 && temp.next!=null;i++)
		{
			temp=temp.next;
		}
		temp.next.val=value;
		return head;
	}
}

class Node
{
	int val;
	Node next;
	public Node(int val)
	{
		this.val=val;
		this.next=null;
	}
	public Node(int val,Node next)
	{
		this.val=val;
		this.next=next;
	}
}
