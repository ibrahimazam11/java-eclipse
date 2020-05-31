package InToPOst;

import java.io.*;
public class InfixToPostfix 
{
	private int maxSize;
	private char[] stackArray;
	private int top;

	public InfixToPostfix(int size) // constructor
	{
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char j) // put item on top of stack
	{ 
		stackArray[++top] = j;
	}

	public char pop() // take item from top of stack
	{ 
		return stackArray[top--];
	}

	public boolean isEmpty() // true if stack is empty
	{ 
		return (top == -1); 
	}

	public int size() // return size
	{ 
		return top;
	}

	public char peekN(int n) // return item at index n
	{ 
		return stackArray[n]; 
	}

	public void displayStack(String s)
	{
		System.out.print("Stack  ");
		for(int j=0; j<=size(); j++)
		{
			System.out.print( peekN(j) );
			System.out.print(' ');
		}
		System.out.println("");
	}
}


class InToPost{
	private InfixToPostfix theStack;
	private String input;
	private String output = "";

	public InToPost(String input) // constructor
	{
		this.input = input;
		int stackSize = input.length();
		theStack = new InfixToPostfix(stackSize);
	}

	public String Conversion() // do translation to postfix
	{
		for(int j=0; j<input.length(); j++)
		{
			char ch = input.charAt(j);
			theStack.displayStack(""+ch);
			switch(ch)
			{
			case '+': 
			case '-':
				gotOper(ch, 1); 
				break;
			case '*': 
			case '/':
				gotOper(ch, 2); 
				break;
			case '(': 
				theStack.push(ch);
				break;
			case ')': 
				Bracket(ch); 
				break;
			default: 
				output = output + ch;
				break;
			} 
		}

		while( !theStack.isEmpty() ) // pop remaining opers
		{
			output = output + theStack.pop(); // write to output
		}
		return output;
	}

	public void gotOper(char opThis, int prec1)
	{ 
		while( !theStack.isEmpty() )
		{
			char opTop = theStack.pop();
			if( opTop == '(' ) 
			{
				theStack.push(opTop);
				break;
			}
			else 
			{
				int prec2; 
				if(opTop=='+' || opTop=='-')
					prec2 = 1;
				else
					prec2 = 2;
				if(prec2 < prec1) 
				{ 
					theStack.push(opTop);
					break;
				}
				else 
					output = output + opTop;
			}
		} 
		theStack.push(opThis); 
	} 

	public void Bracket(char ch)
	{ 
		while( !theStack.isEmpty() )
		{
			char chx = theStack.pop();
			if( chx == '(' ) 
				break;
			else 
				output = output + chx; 
		} 
	} 

} 
