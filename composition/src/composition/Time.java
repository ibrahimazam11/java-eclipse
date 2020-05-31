package composition;

public class Time 
{
	int hours;
	int min;
	int sec;
	
	public Time(int hours, int min, int sec)
	{
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}
	
	void DisplayTime()
	{
		System.out.println(hours+":"+min+":"+sec);
	}
}

class StopWatch
{
	Time start;
	Time stop;
	
	StopWatch(Time start, Time stop)
	{
		this.start = start;
		this.stop = stop;
	}
	
	void Display()
	{
		System.out.println("Start Time ="+start+"\nStop Time ="+stop);
	}
	
}

class test
{
	public static void main(String[] args)
	{
		Time start = new Time(12,03,55);
		start.DisplayTime();
		Time stop = new Time(02,59,55);
		stop.DisplayTime();
		
		StopWatch sw = new StopWatch(start,stop);
		sw.Display();
	}
}
