package ibrahim3;

public class vehicle 
{
	String name;
	int num;
	String owner;
	
	vehicle(String n, int x, String o)
	{
		name = n;
		num = x;
		owner = o;
		
	}
	
	public String toString()
	{
		return("Manufacturer Name : "+name+" Number of Cylinders : "+num+" Owner : "+owner);
	}
	
}

class truck extends vehicle
{
	double load;
	int tow;
	
	truck(String a,int b,String c,double l, int t)
	{
		super(a,b,c);
		load = l;
		tow = t;
	}
	
	public String toString()
	{
		return("Manufacturer Name : "+name+" Number of Cylinders : "+num+" Owner : "+owner+" load capacity : "+load+" towing capacity "+tow);
	}
	
}


class Person
{
	
private String name;

public Person()
{
	name = "ibrahim";
}

public Person(String theName)
{
	name = theName;
}

public Person(Person Object)
{
	name=Object.name;
}

public String getName()
{
	return name;
}

public void setName(String myName)
{
	name=myName;
}

public String toString()
{
	return name;
}

public boolean equals(Object obj)
{
	if(this==obj)
	{
		return true;
	}
	if(obj==null)
	{
		return false;
	}
	return true;
	
}
}


class test
{
	public static void main(String[] args)
	{
		truck t = new truck("Honda",4,"Ibrahim",10000,20000);
		System.out.print(t);
	}
}




