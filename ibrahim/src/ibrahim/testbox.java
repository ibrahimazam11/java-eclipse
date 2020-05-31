package ibrahim;

public class testbox 
{
	public static void main(String[] args)
	{
		int x =5,y=5,z=2;
		double volume;
		box mybox;
		mybox = new box(x,y,z);
		volume= mybox.vol();
		System.out.println(volume);
		
	}
}
