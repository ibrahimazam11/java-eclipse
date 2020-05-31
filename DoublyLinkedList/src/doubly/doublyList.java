package doubly;

public class doublyList<listable extends Comparable<listable>> 
{
	class ListNode
	{
		listable info;
		ListNode next;
		ListNode prev;
	}
	
	protected ListNode first;
	protected ListNode last;
	int numItems;
	
	protected ListNode loc_;
	
	doublyList()
	{
		first = null;
		last = null;
		numItems = 0;
				
	}
	
	public boolean isEmpty()
	{
		return numItems == 0;
	}
	
	public void insertAtFront(listable item)
	{
		ListNode newNode = new ListNode();
		newNode.info = item;
		newNode.next = first;
		newNode.prev = null;
		
		if(first ==null)
		{
			first = newNode;
			last = newNode;
		}
		
		else
		{
			first.prev = newNode;
			first = newNode;
		}
		numItems++;
	}
	
	public void insertAtEnd(listable item)
	{
		ListNode newNode = new ListNode();
		
		newNode.info = item;
		newNode.next = null;
		newNode.prev = last;
		
		if(first == null)
		{
			first = newNode;
			last = newNode;
		}
		
		else
		{
			last.next = newNode;
			last = newNode;
		}
		
		numItems++;
	}
	
	public void insertAtMiddle(listable item, int pos)
	{
		ListNode newNode = new ListNode();
		
		if(pos > (numItems + 1))
		{
			System.out.println("invalid position");
		}
		else if(pos == 1)
		{
			insertAtFront(item);
		}
		else if(pos == numItems)
		{
			insertAtEnd(item);
		}
		else
		{
			
			ListNode loc = first;
			
			int count=1;
			
			while(loc.next != null && pos != (count+1))
			{
				loc = loc.next;
				
				++count;
			}
			
			newNode.info = item;
			newNode.next = loc.next;
			newNode.prev = loc.prev;
			loc.next = newNode;
			loc.prev = newNode;
			numItems++;
			
			
		}
		
	
	}
	
	
	
	public void insertSorted(listable key)
	{
		ListNode loc_ = first;
		int count=1;
		boolean found = false;
		while(loc_.next != null)
		{
			if(loc_.info.compareTo(key)<0)
			{
				loc_ = loc_.next;
				
			}
			if(loc_.info == key)
			{
				found = true;
			}	
			++count;
		} 
		
		  if(found)
		  {
			  System.out.println("Invalid Insertion: Item"+key+" alreaday exists");   
			  
		  }   
		  else
		  {    if(loc_==null)//Insertion in empty list     
			   		insertAtFront(key);    
		  	   else if(loc_==first && loc_==last)
		  	   {     
		  		   if(loc_.info.compareTo(key)>0)
		  		   {//arg1 > arg2      
		  			   this.insertAtFront(key);     
		  			   
		  		   }    
		  		   else
		  		   {      this.insertAtFront(key);     
		  		   
		  		   }    
		  		   
		  	   }
		 
		  	 else{     if(loc_==last && loc_.info.compareTo(key)<0)
		  	 {//Insertion //at the end of the list      
		  		 this.insertAtEnd(key);     
		  		 }     
		  	 else
		  	 {//Insertion in the middle of the list      
		  		 ListNode newNode = new ListNode();      
		  		 newNode.info=key;      
		  		 newNode.prev=loc_.prev;      
		  		 newNode.next=loc_;      
		  		 (loc_.prev).next=newNode;      
		  		 loc_.prev=newNode;     
		  		 }    
		  	 }   
		  }
		  	
	}
	
	
	public void deleteElementSorted(listable key)
	{  
		boolean found = false;
		int count=1;
		while(loc_.next != null)
		{
			if(loc_.info.compareTo(key)<0)
			{
				loc_ = loc_.next;
				
			}
			if(loc_.info == key)
			{
				found = true;
			}	
			++count;
		} 
		
		if(!found)
		{ 
			System.out.println("Invalid Deletion: Value not found in the list");    
			return;   
		}  
		else
			{
			if(first==last)
			{//If deleting only item of the list     
				first=null;     
				last=null;  
			}    else 
				if (loc_==first)
				{//if deleting first item of the list     
					(loc_.next).prev=loc_.prev;     
					first=first.next;     
					loc_=null;  
				}    else 
					if (loc_==last) 
					{//if deleting last item of the list     
						(loc_.prev).next=loc_.next;     
						last=last.prev;     
						loc_=null;    
						}  
					else
					{//deleting item from the middle of the list     
						(loc_.prev).next=loc_.next;     
						(loc_.next).prev=loc_.prev;     
						loc_=null;    
						}       
			}    
		System.gc(); // explicitly calling garbage collector  } 
						
						
			
	}
	
	
	public void printList(boolean direction)
	{
		ListNode location;
		
		if(this.isEmpty())
		{
			System.out.println("List is empty");
		}
		
		if(direction)
		{
			System.out.println("Printing from first to last");
			
			for(location = first ; location != null ; location = location.next)
			{
				System.out.println(location.info);
			}
			
		}
		
		else
		{
			System.out.println("Printing from last to first");
			
			for(location = last ; location != null ; location = location.prev)
			{
				System.out.println(location.info);
			}
		}
		
		
	}
	
}
