package doubly;

public class Main 
{

	public static void main(String[] args) 
	{
		doublyList<String> obj = new doublyList<String>();
		obj.insertAtFront("rizwan");
		obj.insertAtFront("mateen");
		obj.insertAtFront("ibrahim");
		obj.insertAtFront("umer");
		obj.insertAtFront("moiz");
		obj.insertAtMiddle("ali", 4);
		obj.printList(true);
	}

}
