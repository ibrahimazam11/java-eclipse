package exception;

public class ExceptionA 
{
	
	try
	{
		ExceptionB exb = new ExceptionB();
		exb.exceptionB(5);
	}
	
	catch(Exception ex)
	{
		System.out.println("abc");
	}

}

class ExceptionB extends ExceptionA
{
	void exceptionB(int ex)
		throws IllegalArgumentException
		{
			throw new IllegalArgumentException("argument not correct"+ex);
		}
}

class ExceptionC extends ExceptionB
{
	
}