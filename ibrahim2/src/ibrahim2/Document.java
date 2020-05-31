package ibrahim2;



public class Document 
{
	String text="abcdef";
	
	public Document()
	{
		text = "body of email";
	}

	public Document(String t)
	{
		text = t;
	}

	public String toString()
	{
		return text;
		
	}
	
	public void setText(String t1)
	{
		text = t1;
	}

}

class Email extends Document
{
	String sender, recipient, title;
	
	String x;
	
	Email()
	{
		super();
		this.sender = getSender();
		this.recipient= getRecipient();
		this.title = getTitle();
	}
	
	String getSender()
	{
		return ("mateen");
	}
	
	String getRecipient()
	{
		return("moiez");
	}
	
	String getTitle()
	{
		return("THE EMAIL");
	}
	
	public String toString()
	{
		return("Title : "+title +" Recipient : "+recipient +" Sender " +sender +" Text : " +text);
		
	}
}

class File extends Document
{
	String pathname;
	
	public File()
	{
		super();
		pathname = "xyz";
	}
	
	public String toString()
	{
		return ("Pathname: " + pathname + "\n" + super.toString());
	}

	public String getPathname()
	{
		return pathname;
	}

	public void setPathname(String newP)
	{
		pathname = newP;
	}

}

class test
{

	public static boolean ContainsKeyword(Document docObject,String keyword)
			{
			if (docObject.toString().indexOf(keyword,0) >= 0)
			return true ;
			return false ;
			}

	public static void main(String[] args) 
	{
		Email e1 = new Email();
		
		ContainsKeyword(e1,"moiz");
		Document d1 = new Document();
		Document d2 = new Document("body of e=mail");
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(e1.toString());
	}
}
