package stack;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        
        Stack obj = new Stack();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression");
        String exp;
        exp = input.next();
        
       //obj.checkSymbol(exp);
       //obj.print();
        
        if(obj.checkParenthesis(exp)) 
        {
            System.out.println("Valid Statement!");
        }
        else 
        {
            System.out.println("Invalid Statement!");
        }
        
       
    }

}


