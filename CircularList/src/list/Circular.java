package list;

public class Circular<listable extends Comparable<listable>> 
{
	class ListNode
	{
		listable info;
		ListNode next;
	}
	
	
	int numItems;
	ListNode currentPos;
	
	protected ListNode first;
	protected ListNode last;
	
	
	Circular()
	{
		first = null;
		last = null;
		numItems = 0;
	}
	
	public void printList()
	{
		ListNode ptr = first;
		
		if(numItems == 0)
		{
			System.out.println("List is empty.");
			return;
		}
		
		if(ptr == null)
			System.out.println("List Empty");
		
		else
		{
		
		while(ptr.next != first)
		{
			System.out.print(ptr.info+"  ->  ");
			ptr = ptr.next;
		}
		
		System.out.print(ptr.info+"  ->  ");
		ptr = ptr.next;
		
		}
	}
	
	
	public void insertAtFront(listable item)
	{
		ListNode newNode = new ListNode();
		newNode.info = item;
		newNode.next = first;
		
		if(first == null)
		{
			first = newNode;
			newNode.next = first;
			last = first;
		}

		else
		{
			last.next = newNode;
			first = newNode;
		}
		
		
		numItems++;
		
	}
	
	public void insertAtEnd(listable item)
	{
		ListNode newNode = new ListNode();
		
		newNode.info = item;
		newNode.next = first;
		
		if(first == null)
		{
			first = newNode;
			newNode.next = first;
			last = first;
		}
		
		else
		{
			last.next = newNode;
			last = newNode;
		}
		
		numItems++;
	}
	
	public void find(listable item)
	{
		ListNode ptr = first;
		
		if(numItems == 0)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(ptr.info != item)
			{
				ptr = ptr.next;
				
				if(ptr.next == first)
					break;
			}
			
			if(ptr.info == item)
			{
				System.out.println("Item Searched\n"+ptr.info);
			}
			else
				System.out.println("Not Found");
			
			
		}
	}
	
	
	public void delete(listable item)
	{
		ListNode loc = first;
		ListNode predLoc = last;
		
		if(numItems == 0)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(loc.info != item)
			{
				predLoc = loc;
				loc = loc.next;
				
				if(loc.next == first)
					break;
			}
			
			if(loc.info == item)
			{
				predLoc.next = loc.next;
				System.out.println("Item deleted");
				return;
			}
			else
			{
				System.out.println("Not Found");
				return;
			}
			
		}
		
		
	}
	
	
	public void destroy()
	{
		first = null;
		last = null;
		System.gc();
	}
	
	
	
	
	
}
