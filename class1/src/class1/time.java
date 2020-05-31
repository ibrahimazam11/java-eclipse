package class1;

public class time 
{
	int x;
	int y;
	int z;
	
	time(int h, int m, int s)
	{
		x=h;
		y=m;
		z=s;
	}
	
	void display()
	{
		System.out.println(x+":"+y+":"+z);
	}
}
