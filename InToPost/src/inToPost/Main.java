package inToPost;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		InfixToPostfix obj = new InfixToPostfix();
		
		System.out.println("Enter an Expression :");
		Scanner input = new Scanner(System.in);
		String exp = input.next();
		obj.InToPost(exp);
	}
}
