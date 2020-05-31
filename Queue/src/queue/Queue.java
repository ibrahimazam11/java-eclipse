package queue;

public class Queue
{
	
	int maxElements;
	int count=0;
	int front=0;
	int rear=-1;
	int [] queue;
	
	public Queue(int max)
	{
		this.maxElements=max;
		queue=new int[maxElements];
		front=0;
		rear=-1;
		
	}
	

	
	public boolean isEmpty()
	{
		if(rear<front)
			return true;
		else
			return false;
		
	}
	
	public boolean full()
	{
		if (rear==maxElements-1)
			return true;
		else
			return false ;
	}
	
	public boolean insert(int x)
	{
		if (full())
		{
			System.out.println("Queue Overflow");
			return false;
		}
		else {
			queue[++rear]=x;
			return true;
	     }
	}
	
	public int remove()
	{
		if (isEmpty())
		{
			System.out.println("Queue Underflow");
			return 0;
		}
		else 
		{
			return queue[front++];
		}

	}
	
	void print()
	{
		
		if(isEmpty()==false)
		{
			while(front!=queue.length)
			{
				System.out.println(queue[front]);
				front++;
			}
		}
		else
		{
			isEmpty();
		}
		front=0;
	}

	public static void main(String[] args)
	{
		Queue obj = new Queue(5);
		
		obj.insert(20);
		obj.insert(88);
		obj.insert(40);
		obj.insert(21);
		obj.insert(80);
		
		obj.print();
		
		
		obj.remove();
		obj.print();
	}

}

	
