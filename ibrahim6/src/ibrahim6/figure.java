package ibrahim6;

public class figure 
{
	void erase()
	{
		System.out.println("Class Name : figure\nMethod Name : erase()");
	}
	
	void draw()
	{
		System.out.println("Method Name : draw()");
	}
	
	void centre()
	{
		erase();
		draw();
		System.out.println("Method centre() is being called...\n\n");
	}
}


class rectangle extends figure
{
	void erase()
	{
		System.out.println("Class Name : rectangle\nMethod Name : erase()");
	}
	
	void draw()
	{
		System.out.println("Method Name : draw()");
	}
	
	void centre()
	{
		erase();
		draw();
		System.out.println("Method centre() is being called...\n\n");
	}
	
}


class triangle extends figure
{
	void erase()
	{
		System.out.println("Class Name : triangle\nMethod Name : erase()");
	}
	
	void draw()
	{
		System.out.println("Method Name : draw()");
	}
	
	void centre()
	{
		erase();
		draw();
		System.out.println("Method centre() is being called...");
	}
}


class test
{
	public static void main(String[] args)
	{
		figure f = new figure();
		triangle t = new triangle();
		rectangle r = new rectangle();
		
		f.erase();
		f.draw();
		f.centre();
		
		t.erase();
		t.draw();
		t.centre();
		
		r.erase();
		r.draw();
		r.centre();
		
		
		
	}
}