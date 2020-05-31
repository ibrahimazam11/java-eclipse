package arraylist;

import java.util.ArrayList;

public class Array1 
{
	public Array1()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("hgkjh");
		list.add("ibrahim");
		list.add("mateen");
		list.add(0,"waqar");
		list.set(1,"moiz");
	
		for(String x : list)
			System.out.println(x);
		
		//System.out.println(list);
		
		int x = list.size();
		System.out.println(x);
	}
}
