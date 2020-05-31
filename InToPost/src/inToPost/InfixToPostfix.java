package inToPost;

import java.util.Scanner;

public class InfixToPostfix 
{
	protected class ListNode 
    {
        protected char info;
        protected ListNode next;
    }
    
	private String output="";
    private ListNode top;
    
    
    InfixToPostfix()
    {
        top = null;
    }
    
    public boolean isEmpty() 
    {
        return top == null;
    }
    
    public void Push(char info) 
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
    
    public char Pop() 
    {
        if(isEmpty()) 
        {           
            return '0' ;
        }           
        char val = top.info;
        top = top.next;
        return val;
    }
    
    
    public void Precedence(char opr , int prec)
    {
    	while( !isEmpty() )
		{
			char Top = Pop();
			if( Top == '(' ) 
			{
				Push(Top);
				break;
			}
			else 
			{
				int prec2; 
				if(Top=='+' || Top=='-')
					prec2 = 1;
				else
					prec2 = 2;
				if(prec2 < prec) 
				{ 
					Push(Top);
					break;
				}
				else 
					output = output + Top;
			}
		} 
		Push(opr); 
    	
    }
    
    public void InToPost(String item)
    {
    	for(int count=0; count<item.length(); count++)
		{
			char ch = item.charAt(count);
			
			if(ch == '+'|| ch == '-')
			{
				Precedence(ch,1);
			}
			else 
			if(ch == '*'|| ch == '/')
			{
				Precedence(ch,2);
			}
			else 
			if(ch == '(')
			{
				Push(ch);
			}
			else
			if(ch == ')')
			{
				Parenthesis(ch);
			}
			else
			if(ch == '^')
			{
				Push(ch);
			}
			else
				output=output+ch;
			

		}

		while( !isEmpty() ) 
		{
			output = output + Pop(); 
		}
		System.out.println(output);
  

    }
    
    public void Parenthesis(char ch)
	{ 
		while( !isEmpty() )
		{
			char pop = Pop();
			if( pop == '(' ) 
				break;
			else 
				output = output + pop; 
		} 
	} 
}

