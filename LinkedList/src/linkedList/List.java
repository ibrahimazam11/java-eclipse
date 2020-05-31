package linkedList;


public class List<listable extends Comparable<listable>> 
{
	protected class ListNode
	{
		
		
		listable info;
		ListNode next;
		
	
	}
	
	protected ListNode list;
	int numItems;
	ListNode currentPos;
	ListNode predLoc_,loc_;
	List()
	{
		numItems = 0;
		list = null;
	}
	
	
	void insertAtFront(listable item)
	{
		ListNode newNode = new ListNode();
		newNode.info = (listable) item;
		newNode.next = list;
		list = newNode;
		numItems++;
	}
	
	
	
	void printList()
	{
		ListNode location = list;
		int count = 0 ;
		if(list==null)
			System.out.println("List is Empty");
		else
		{
			System.out.println("printing list");
			for(location = list ; location!=null ; location=location.next)
			{
				System.out.println(location.info+" is "+(++count)+" th item");
				
			}
		}
	}
	
	
	

	public void swap(int pos1, int pos2)
	{
		ListNode loc_1, loc_2, loc_3, predLoc_1, predLoc_2;
		
		
		loc_1 = list;
		loc_2 = list;
		loc_3 = list;
		predLoc_1 = null;
		predLoc_2 = null;
		
		for(int count=0 ; count != pos1 ; count++)
		{
			predLoc_1 = loc_1;
			loc_1 = loc_1.next;
		}
		
		for(int count=0 ; count != pos2 ; count++)
		{
			predLoc_2 = loc_2;
			loc_2 = loc_2.next;
		}
		
		for(int count=0 ; count != pos2 ; count++)
		{
			loc_3 = loc_3.next;
		}
		
		predLoc_2.next = loc_1;
		predLoc_1.next = loc_2;
		loc_2.next = loc_1.next;
		loc_1.next = loc_3;
		
		
		System.out.println(loc_1.info);
	}
	
	
}