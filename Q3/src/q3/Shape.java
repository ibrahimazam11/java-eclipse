package q3;

public abstract class Shape 
{

	int numSides;
	
	
	Shape(int n)
	{
		numSides=n;
	}
	

	
	int getnumSides(int m)
	{
		return numSides;
	}
	
     abstract double getArea();
     abstract double getPerimeter(); 
}


class Rectangle extends Shape
{
	double width, height;
	
	
	Rectangle(int n, double w, double h)
	{
		super(n);
		width = w;
		height = h;
		
	}
	
	double getArea()
	{
		System.out.println("Sides : "+numSides);
		return width*height;
	}
	
	double getPerimeter()
	{
		System.out.println("Sides : "+numSides);
		return 2*height+2*width;
	}
	
}

class RtTriangle extends Shape
{
	double width, height;
	
	RtTriangle(int n, double w, double h)
	{
		super(n);
		width = w; 
		height = h;
		
	}
	
	double getArea()
	{
		System.out.println("Sides : "+numSides);
		return 0.5*(width+height);
	}
	
	double getPerimeter()
	{
		System.out.println("Sides : "+numSides);
		return width*height;
	}
}

class test
{
	public static void main(String[] args)
	{
		Shape s;
		
		Rectangle r1 = new Rectangle(4,2,8);
		
		System.out.println("Area of Rectangle :"+r1.getArea());
		System.out.println("Perimeter of Rectangle : "+r1.getPerimeter());
		
		RtTriangle t1 = new RtTriangle(3,12,5);
		
		System.out.println("Area of triangle :"+t1.getArea());
		System.out.println("Perimeter of triangle :"+t1.getPerimeter());
		
		
	}
}
