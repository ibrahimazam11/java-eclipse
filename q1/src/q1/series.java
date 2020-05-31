package q1;

public class series {

	int sNum;
	int count=0;
	
	series(int s, int c)
	{
		sNum = s;
		count = c;
	}
	
	void member()
	{
		System.out.println("I am Object Number :"+count+" and Serial Number :"+sNum);
		
	}


}

class test
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=3;i++)
		{
		series si = new series(93+i,i);
		si.member();
		}
		
		
	}
}