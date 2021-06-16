package MyPac;

public class DoublyLin {

	public static void main(String[] args) 
	{
		DoublyLinkedList list=new DoublyLinkedList();
		list.push(23);
		list.push(11);
		list.push(78);
		list.push(66);
		
		list.insertAfter(list.head.next.next,8);
		
		list.append(77);
		list.append(89);
		
		list.deleteNode(list.head.next.prev);
		
		list.show();
	}
}
class Node
{
	int data;
	Node next;
	Node prev;
	public Node(int data) {
		this.data = data;
	}
}
class DoublyLinkedList
{
	Node head;
	public void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		node.prev=null;
		
		if(head!=null)
		{
			head.prev=node;
		}
		head=node;
	}
	public void insertAfter(Node prev,int data)
	{
		if(prev==null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}else
		{
		Node n=new Node(data);
		n.next=prev.next;
		prev.next=n;
		n.prev=prev;
		if(n.next!=null)
		{
			n.next.prev=n;
		}
		}
	}
	public void append(int data)
	{
		Node n=new Node(data);
		Node last=head;
		n.next=null;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=n;
		n.prev=last;
	}
	public void deleteNode(Node del)
	{
		if(head==null || del==null)
		{
			return;
		}
		
		if(head==del)
		{
			head=del.next;
		}
		
		if(del.next!=null)
		{
			del.next.prev=del.prev;
		}
		if(del.prev!=null)
		{
			del.prev.next=del.next;
		}
		
		return;
	}
	public void show()
	{
		Node last=null;
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			last=n;
			n=n.next;
		}
	}
}
