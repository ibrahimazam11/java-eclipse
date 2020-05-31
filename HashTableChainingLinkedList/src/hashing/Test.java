/*
 * DATA STRUCTURE PROJECT
 * 
 * 
 * 
 * GROUP MEMBERS:
 * 
 * Ibrahim Azam (FA13-BCS-093)
 * Mateen Sheikh (FA13-BCS-066)
 */



/*********************************************************************************************************************
**************     Java Program to Implement Hash Tables chaining with Singly Linked Lists        ********************
**********************************************************************************************************************/



package hashing;


import java.util.Scanner;

 

/* Node for linked list */

class ListNode

{

    ListNode next;

    int info;

 

    /* Constructor */

    public ListNode(int x)

    {

        info = x;

        next = null;

    }

}

 

/* Class HashTable */

class HashTable

{

    private ListNode[] table;

    private int numItems ;

 

    /* Constructor */

    public HashTable(int tableSize)

    {

        table = new ListNode[tableSize];

        numItems = 0;

    }
    
    
    

    /* Method to check if hash table is empty */

    public boolean isEmpty()

    {

        return numItems == 0;

    }

    
    
    
    /* Method to remove all elements of the hash table */

    public void removeAll()

    {

        for(int count=0 ; count < table.length ; count++)
        {	
        	table[count] = null;
        }
        
        numItems = 0;

    }

    
    
    /* Method to get total items */

    public int getSize()

    {

        return numItems;

    }

    
    
    /* Method to insert an element in the Hash Table */

    public void insert(int val)

    {

        numItems++;

        int pos = hash(val);        

        ListNode newNode = new ListNode(val);                

        if (table[pos] == null)

            table[pos] = newNode;            

        else

        {

            newNode.next = table[pos];

            table[pos] = newNode;

        }    

    }

    
    
    /* Method to remove an element from the Hash Table */

    public void remove(int val)

    {
    	if(isEmpty() == true)
    	{
    		System.out.println("\nHash Table is Empty");
    		return;
    	}

        int pos = hash(val);    

        ListNode start = table[pos];

        ListNode reference = table[pos];
   
        if (start.info == val)   //If the element is first one
        {

            numItems--;

            table[pos] = start.next;

            return;

        }

        while (reference.next != null && reference.next.info != val)
        {
            reference = reference.next;
        }
        
        
        if (reference.next == null)

        {

            System.out.println("\nElement not found\n");

            return;

        }

        numItems--;

        if (reference.next.next == null)   //If the element to remove is second last

        {

            reference.next = null;

            return;

        }

        reference.next = reference.next.next;     //If the element to remove is in the middle

        table[pos] = start;

    }

    
    
    
    
    /* Function hash */

    private int hash(Integer hashValue )

    {
    	hashValue = hashValue % table.length;
    	
    	if(hashValue < 0)
    	{
    		hashValue = hashValue + table.length;
    	}
    	return hashValue;

    }


/* Method to print the table*/
    
    public void print()

    {

       System.out.println();

        for (int count = 0; count < table.length; count++)
        {

            System.out.print ("Index " + count + ":  ");             

 

            for(ListNode start=table[count] ; start != null ; start=start.next)
            {

                System.out.print(start.info +" ");

            }

            System.out.println();

        }

    }
    
    boolean search(int item)
    {
    	if(isEmpty() == true)
    	{
    		System.out.println("\nHash Table is Empty");
    		return false;
    	}
    	
    	for(int count=0;count<table.length;count++)
    	{
    		for(ListNode start=table[count];start!=null;start=start.next)
    		{
    			if(item==start.info)
    			{
    				System.out.println("found");
    				return true;
    			}
    		}
    	}
    	return false;
    }

}

class Test

{ 

	
	public static void main(String[] args) 

	{
		

		Scanner input = new Scanner(System.in);

		System.out.println("\t\t\t\t\t\t\t__________\n");
		System.out.println("\t\t\t\t\t\t\tHASH TABLE");
		System.out.println("\t\t\t\t\t\t\t__________\n");
		System.out.println("\t\t\t\t\t\t\t\t\t************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t*PROJECT BY: S.M IBRAHIM AZAM AND MATEEN SHEIKH*");
		System.out.println("\t\t\t\t\t\t\t\t\t************************************************");

		HashTable obj = new HashTable(10 );

		

		char ch;

		/*  Perform Hash Table operations  */

		do    

		{

			System.out.println("\n\n\t\t\t\t**************Hash Table Operations**************\n");

			System.out.println("1. Insert ");

			System.out.println("2. Remove");

			System.out.println("3. Size");

			System.out.println("4. Clear"); 

			System.out.println("5. Check empty");



			int choice = input.nextInt();            

			switch (choice)

			{

			case 1 : 

				System.out.println("Enter integer element to insert");

				obj.insert( input.nextInt() ); 

				break;                          

			case 2 :                 

				System.out.println("Enter integer element to delete");
				int x=input.nextInt();
				if(obj.search(x))
					obj.remove(x); 
				else
					System.out.println("item not found");

				break;                        


			case 3 : 

				System.out.println("Size = "+obj.getSize() );

				break; 


			case 4 : 

				obj.removeAll();

				System.out.println("Hash Table Cleared\n");

				break;

			case 5 : 

				System.out.println("Empty status = "+obj.isEmpty() );

				break;        

			default : 

				System.out.println("Wrong Entry \n ");

				break;   

			}

			obj.print();  



			System.out.println("\nDo you want to continue (Type y or n) \n");

			ch = input.next().charAt(0);                        

		} while (ch == 'Y'|| ch == 'y');  

		input.close();
	}
	
}

	

 
