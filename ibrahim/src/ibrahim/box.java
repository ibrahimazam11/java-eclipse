package ibrahim;

public class box
{
	double width;
	double length;
	double height;
	
	box(double w, double l, double h)
	{
		width = w ;
		length = l ;
		height = h ;
		
	}
	
	double vol()
	{
		return height*width*length;
	}
}

