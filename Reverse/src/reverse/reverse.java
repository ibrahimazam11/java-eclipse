package reverse;

import java.util.Scanner;
public class reverse{
	protected class ListNode {
        protected int info;
        protected ListNode next;
		
    }
	ListNode list;
	public boolean isEmpty() {
		if(list==null)
		{
        return true;
    }
		else
		{
		return false;
	}
	}
	public void insert(int x) {
        ListNode newNode = new ListNode();
        newNode.info = x;
    
        if(list==null) {
            newNode.next = null;
            list = newNode;
        }
        else {
            newNode.next = list;
            list = newNode;
        }
    }
    public void Reverse() {
        if (list == null) {
            System.out.println("null");
        } else {
            ReverseRecursive(list);
        }
    }

    private void ReverseRecursive(ListNode node) {
        if (node == null)
        {
            return;
        }
        ReverseRecursive(node.next);
        System.out.print(node.info + " ");
    }
    public void print()
    {
    	ListNode loc =list;
for(loc=list;loc.next!=null;loc=loc.next)
{
	System.out.print(loc.info+" ");
}
System.out.print(loc.info);
    }

    public static void main(String[] args) {
       
        reverse obj= new reverse();
        int x;
        Scanner input = new Scanner(System.in);


for(int i=0;i<5;i++)
            	{
            	System.out.println("Enter value :");
            	 x=input.nextInt();
            	 obj.insert(x);
            	}

            System.out.print("\nreverse list :");
            obj.Reverse();
    }
}
   