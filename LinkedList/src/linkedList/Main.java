package linkedList;

public class Main {

	public static void main(String[] args) 
	{
		List<String> obj = new List<String>();
		
		obj.insertAtFront("moiz");
		obj.insertAtFront("ali");
		obj.insertAtFront("waqar");
		obj.insertAtFront("mateen");
		obj.insertAtFront("ibrahim");
		
		obj.printList();
		
		obj.swap(1, 3);

	}

}
