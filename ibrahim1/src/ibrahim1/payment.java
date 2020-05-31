package ibrahim1;

public class payment 
{
	private double amount;
	
	void set(double payment)
	{
		amount = payment;
		
	}
	
	public double get()
	{
		return amount;
	}
	
	void paymentDetails()
	{
		System.out.println("The amount of the payment is :"+amount);
		
	}
}


	class cashPayment extends payment
	{
		cashPayment(double x)
		{
			set(x);
			
		}
		
		void paymentDetails()
		{
			System.out.println("The payment is in cash "+get());
		}
	}
	
	class creditCardPayment extends payment
	{
		String name; 
		String expiry; 
		double number;
		double amount;
		
		creditCardPayment(String n, String e, double num, double a)
		{
			name = n;
			expiry = e;
			number = num;
			set(a);
		}
		
		void paymentDetails()
		{
			System.out.println("Card Name : "+name);
			System.out.println("Expiration Date : "+expiry);
			System.out.println("Credit Card Number : "+number);
			System.out.println("amount of payment : "+get());
		}
	}
	
class test
{

public static void main(String[] args)
{
	
	cashPayment c1 = new cashPayment(1000);
	cashPayment c2 = new cashPayment(900);
	
	creditCardPayment d1 = new creditCardPayment("123", "30-05-2014", 6789, 1919);
	creditCardPayment d2 = new creditCardPayment("456", "23-04-2014", 9876, 1515);
	
	
	c1.paymentDetails();
	c2.paymentDetails();
	
	d1.paymentDetails();
	d2.paymentDetails();
	
	
}
}

