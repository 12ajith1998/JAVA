public class InnnerThread {
	public static void main(String[] args) throws Exception {
		A a=new A();
		new Producer(a);
		new Consumer(a);
	}
}
class A{
	int num;
	boolean value=false;
	public synchronized void put(int num) 
	{
		while(value) //true means running or else waiting stage
		{
			try {wait();}catch(Exception e) {} 
		}
		System.out.println("put : "+num);
		this.num = num;
		value=true;
		notify();
	}
	public synchronized void get() 
	{
		while(!value) //false means running or else waiting stage
		{
			try {wait();}catch(Exception e) {}
		}
		System.out.println("get : "+num);
		value=false;
		notify();
	}
}
class Producer implements Runnable
{
	A a;

	public Producer(A a) {
		this.a = a;
		Thread t=new Thread(this,"producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	
}
class Consumer implements Runnable{
	A a;

	public Consumer(A a) {
		this.a = a;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		while(true)
		{
		a.get();
		try {Thread.sleep(500);}catch(Exception e) {}
	
		}
	}
}
