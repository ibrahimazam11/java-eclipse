import java.util.Scanner;
public class PostFix {

	protected class node{
		protected int data;
		protected node next;
	}

	int TotalElements;
	protected node loc, top;

	PostFix(){
		top = null;
		TotalElements = 0;
	}

	public void push(int newvalue){
		node newnode = new node();
		if(top==null){
			newnode.data = newvalue;
			newnode.next = null;
			top = newnode; 
		}else{
			newnode.data = newvalue;
			newnode.next = top;
			top = newnode;
		}
		TotalElements++;
	}

	public int pop(){
		if(top==null){
			return 0;
		}
		else{
			int b;
			b = top.data;
			top=top.next;
			return b;
		}
	}

	public int solveExpression(String equation){

		char c;
		int i,value,value1=0,value2=0;

		for(i=0;i<equation.length();i++){
			c=equation.charAt(i);

			if(c == '+' || c == '-' || c == '/' || c=='*'){
				if(c == '+'){
					value2=pop();
					value1=pop();
					value=value1 + value2;
					push(value);
				}
				if(c == '-'){
					value2=pop();
					value1=pop();
					value=value1 - value2;
					push(value);
				}
				if(c == '*'){
					value2=pop();
					value1=pop();
					value=value1 * value2;
					push(value);
				}
				if(c == '/'){
					value2=pop();
					value1=pop();
					value=value1 / value2;
					push(value);
				}
				if(c == '^'){
					value2=pop();
					value1=pop();
					value=value1 ^ value2;
					push(value);
				}				
			}else{
				value=Character.getNumericValue(c);
				push(value);
			}
		}
		return pop();
	}

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);

		System.out.println("Enter expression: ");
		String expression=in.next();
		PostFix stack= new PostFix();
		System.out.println(stack.solveExpression(expression));		

	}	

}
