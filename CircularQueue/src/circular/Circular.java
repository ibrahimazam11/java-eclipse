package circular;

public class Circular 
{
		int maxElements;
		int count=0;
		int front=0;
		int rear=maxElements-1;
		int [] queue;
		
		public Circular(int max)
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
			if (rear==maxElements)
				return true;
			else
				return false ;
		}
		
		public void insert(int x)
		{
			if (full())
			{
				System.out.println("Queue Overflow");
				return;
			}
			else {
				rear++;
				if(rear==maxElements)
				{
					rear=0;
				}
				queue[rear]=x;
				count++;
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
				int x=queue[front];
				front++;
				if(front==maxElements)
				{
					front=0;
				}
				count--;
				
				return x;
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
			Circular obj = new Circular(5);
			
			obj.insert(1);
			obj.insert(2);
			obj.insert(3);
			obj.insert(4);
			obj.insert(5);
			
			obj.print();
			
		
			obj.remove();
			obj.remove();
			obj.remove();
			obj.remove();
			obj.remove();
			obj.print();
		}

	

		

}
