package fibonacci;



public class fibonacci 
{
	public int recursion(int n)
	{
		System.out.println("fibonacci("+n+")called");
		if(n==0||n==1)
		{
			
			return 1;
			
		}
		else
		{
			int temp=recursion(n-2) + recursion(n-1);
			System.out.println("End of fibonacci("+n+")call.\ntemp= "+temp);
			return temp;
		}
	}
	
	public static void main(String[] args)
	{
		fibonacci obj = new fibonacci();
		obj.recursion(5);
		
	}
}
