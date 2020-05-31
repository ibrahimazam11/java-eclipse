package postfix;


public class Main 
{

    public static void main(String[] args) 
    {
        
        Stack s = new Stack();
        if(s.Validate("{(Ibrahim)}")) 
        {
            System.out.println("Valid Statement!");
        }
        else 
        {
            System.out.println("Invalid Statement!");
        }
        
        System.out.println(s.Pop());
    }

}

