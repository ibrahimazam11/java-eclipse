package stack;



public class Stack 
{


    protected class ListNode 
    {
        protected int info;
        protected ListNode next;
    }
    
    private ListNode top;
    
    
    Stack()
    {
        top = null;
    }
    
    public boolean isEmpty() 
    {
        return top == null;
    }
    
    public void Push(int info) 
    {
        ListNode newNode = new ListNode();
        newNode.info = info;
    
        if(isEmpty()) 
        {
            newNode.next = null;
            top = newNode;
        }
        else 
        {
            newNode.next = top;
            top = newNode;
        }
    }
    
    public int Pop() 
    {
        if(isEmpty()) 
        {           
            return '0' ;
        }           
        int val = top.info;
        top = top.next;
        return val;
    }
    
    public boolean checkParenthesis(String item) 
    {
       boolean valid = true;
       for(int count = 0;count < item.length();count++) 
       {
           if(item.charAt(count) == '(' ||item.charAt(count) == '[' || item.charAt(count) == '{') 
           {
               Push(item.charAt(count));
           }
           if(item.charAt(count) == ')' ||item.charAt(count) == ']' || item.charAt(count) == '}') 
           {
               int pop = Pop();
               if(((pop == '(') && (item.charAt(count) == ')')) || ((pop == '[') && (item.charAt(count) == ']')) || ((pop == '{') && (item.charAt(count) == '}'))) 
               {
                   valid = true;
               }
               else 
               {
                   valid = false;
               }                  

           }
       }
       if(!isEmpty()) 
       {
           return valid;
       }
       return valid; 
    }








    public void checkSymbol(String key)
    {
    	int getValue=0;
    	char t;
     for(int count=0;count<key.length();count++)
     {
    	if(key.charAt(count)=='+' ||key.charAt(count)=='-' || key.charAt(count)=='*' || key.charAt(count)=='/' )
    	{
    		 int pop=Pop();
    		 int pop1=Pop();
    		 int val = 0;
    		 if(key.charAt(count)=='+')
    		 {
    		 val=pop1+pop;
    		 }
    		 if(key.charAt(count)=='-')
    		 {
    		 val=pop1-pop;
    		 }
    		 if(key.charAt(count)=='*')
    		 {
    		 val=pop1*pop;
    		 }
    		 if(key.charAt(count)=='/')
    		 {
    		 val=pop1/pop;
    		 }
    		
    		 Push(val);
    	}
    	else
    	{
    		 getValue=Character.getNumericValue(key.charAt(count));
    		 Push(getValue);
    	}
	
     }
    }
    


    public void print()
	{
		System.out.println(top.info);
	
	}
}