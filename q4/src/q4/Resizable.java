package q4;

public interface Resizable 
{
	public abstract double resize(double x);
	
}


class rectangle implements Resizable
{
	double width=2;
	double height=3;
	
	double area()
	{
		return width*height;
	}
	
	public double resize(double x)
	{
		return x*(width*height);
	}
	
	double perimeter()
	{
		return 2*(width+height);
	}
	
	public double resizePeri(double x)
	{
		return 2*x*(width+height);
	}
	
}

class test
{
	public static void main(String[] args)
	{
		rectangle r1 = new rectangle();
		System.out.println("Area = "+r1.area());
		System.out.println("Resized Area = "+r1.resize(2));
		System.out.println("Perimeter = "+r1.perimeter());
		System.out.println("Resized Perimeter = "+r1.resizePeri(2));
	}
	
}

