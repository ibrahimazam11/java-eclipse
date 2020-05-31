package factorial;

public class factorial 
{

	public int recursion(int n)
	{
		if(n==0)
		{
			System.out.println("factorial("+n+")called");
			return 1;
			
		}
		else 
		{
			
			int temp=n*recursion(n-1);
			System.out.println("factorial("+n+")caal ended.\nOutput = "+temp);
			return temp;
		}
		
	}
	
	public static void main(String[] args)
	{
		factorial obj = new factorial();
		obj.recursion(4);
	
	}
}
