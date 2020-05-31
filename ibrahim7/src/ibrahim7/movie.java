package ibrahim7;

import java.util.Scanner;

public class movie 
{
	String rating;
	int id;
	String title;
	
	movie(String r, int i, String t)
	{
		rating = r;
		id = i;
		title = t;
		
	}
	
    public int getID()
    {
        return id;
    }

    public void setID(int ID)
    {
        id = ID;
    }
    
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String name)
    {
        this.title = name;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }

    public boolean equals(Object other)
	{   
    	if (other == null)
	
		
		return false;
	
	else if (getClass() != other.getClass())
		
		return false;
	
	else
	{
		movie otherMovie = (movie) other;
		if (otherMovie.getID() == this.getID()) return true;
	}
    	return false;

}}


class action extends movie
{
	action(String r, int i, String t)
	{
		super(r,i,t);
	}
	
	void calcLateFees()
	{
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of days a movie is late : ");
		a= input.nextInt();
		
		a=a*3;
		
		System.out.println("Late fee for action movie is $"+a);
		
		
	}
	

}


class Comedy extends movie
{
	Comedy(String r, int i, String t)
	{
		super(r,i,t);
	}
	
	void calcLateFees()
	{
		double a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of days a movie is late : ");
		a= input.nextInt();
		
		a=a*2.5;
		
		System.out.println("Late fee for comedy is $"+a);
		
		
	}
	
}


class drama extends movie
{
	drama(String r, int i, String t)
	{
		super(r,i,t);
	}
	
	void calcLateFees()
	{
		double a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of days a movie is late : ");
		a= input.nextInt();
		
		a=a*2;
		
		System.out.println("Late fee for drama is $"+a);
		
		
	}
}
class test
{
	public static void main(String[] args)
	{
		movie m = new movie("PG-13",1991,"abc");
		action a = new action("R",1515,"def");
		Comedy c = new Comedy("PG-13",1234,"sdfsf");
		m.equals(m);
		a.calcLateFees();
		c.calcLateFees();
		
	}
}

