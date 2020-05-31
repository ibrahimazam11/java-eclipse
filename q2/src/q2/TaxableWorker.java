package q2;

public class TaxableWorker 
{
	 String name;
	 double pay;
	 double tax;
	 double gp;
	 double TWH;
	 
	 TaxableWorker(String n, double p, double t)
	 {
		 name = n;
		 pay = p;
		 tax = t;
		 
	 }
	 
	 void setPay(int a)
	 {
		 pay = a;
	 }
	 
	 void setTax(int b)
	 {
		 tax = b;
	 }
	 
	 String WorkerInfo()
	 {
		 return ("Name : "+name+" Hourly Pay Rate : "+pay+" Federal Tax Rate : "+tax);
		 
	 }
	 
	 double grossPay(double h)
	 {
		 gp = h*pay;
		 return gp;
	 }
	 
	 double taxWithheld()
	 {
	
		 double tw;
		 tw=gp*tax;
		 TWH = tw;
		 return tw;
	 }
	 
}

class StateTaxableWorker extends TaxableWorker
{
	String sn;
	double stax;
	
	StateTaxableWorker(String n, double p, double t, String sn, double stax)
	{
		super(n,p,t);
		this.sn = sn;
		this.stax = stax;
	}
	
	void setStateTax(double s)
	{
		stax = s; 
	}
	
	String WorkerInfo()
	{
		return ("Name : "+name+" Hourly Pay Rate : "+pay+" Federal Tax Rate : "+tax+" State Name : "+sn+" State Tax Rate "+stax);
		 
	}
	
	double taxWithheld()
	 {
	
		 double stw;
		 stw=gp*stax;
		 TWH = TWH + stw;
		 return stw;
	 }
	
}


class LocalTaxableWorker extends StateTaxableWorker
{
	String cname;
	double ctax;
	
	LocalTaxableWorker(String n, double p, double t, String sn, double stax, String c, double ctax)
	{
		super(n,p,t,sn, stax);
		cname = c;
		this.ctax = ctax;
	}
	
	void setCityTax(int c)
	{
		ctax = c;
	}
	
	String WorkerInfo()
	{
		return ("Name : "+name+" Hourly Pay Rate : "+pay+" Federal Tax Rate : "+tax+" State Name : "+sn+" State Tax Rate "+stax+" City Name"+cname+" City Tax Rate"+ctax);
		 
	}
	
	double taxWithheld()
	 {
	
		 double stwh;
		 stwh=gp*ctax;
		 TWH = TWH + stwh;
		 return stwh;
	 }
	
}

class test
{
	public static void main(String[] args)
	{
		StateTaxableWorker s1 = new StateTaxableWorker("mateen",12.50,0.25,"abc",0.05);
	    
		LocalTaxableWorker l1 = new LocalTaxableWorker("ibrahim", 12.50, 0.25, "def",0.05,"ghi",0.025);
		
		TaxableWorker t1 = new TaxableWorker("moiz", 12.50, 0.25);
		
		System.out.println(s1.WorkerInfo());
		System.out.println(s1.grossPay(12));
		System.out.println(s1.taxWithheld());
		
		System.out.println(l1.WorkerInfo());
		System.out.println(l1.grossPay(4));
		System.out.println(l1.taxWithheld());
		
		System.out.println(t1.WorkerInfo());
		System.out.println(t1.grossPay(9));
		System.out.println(t1.taxWithheld());
	}
}

