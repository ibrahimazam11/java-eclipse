package list;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		
		int x = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to display\npress 2 to insert at front\npress 3 to insert At End");
		System.out.println("Press 4 to delete an item\npress 5 to destroy list\npress 6 to find");
		x = input.nextInt();
		
		Circular<String> obj = new Circular<String>();
		
		switch(x)
		{
			case 1 : obj.printList();
			         break;
			 
			case 2 : System.out.println("Enter text to Insert at front ");
					 String y;
					 y= input.next();
					 
					 obj.insertAtFront(y);
					
			         obj.printList();
			         
			         break;
			         
			case 3 : System.out.println("Enter text to insert at end");
					 y= input.next();
					 
					 obj.insertAtEnd(y);
					 break;
				
			case 4 : System.out.println("Enter item to delete");
					 y= input.next();
					 
					 
					 obj.delete(y);
					 break;
					 
					 
			case 5 : obj.destroy();
					 
			case 6 : System.out.println("Enter item to find");
			 y= input.next();
			 
			 
			 obj.find(y);
			 break;
	}

}
}