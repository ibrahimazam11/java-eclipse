package hashing;

import java.util.Scanner;

public class Hashing 
{

	protected class listNode
	{
		protected listNode below=null;   
		protected	listNode next=null; 
		protected int value; 
		protected String names; 
		protected int emp_id; 

	}
	
	private listNode list=null;
	listNode newnode;  
	int id; 
	listNode refrence2;       
	listNode refrence3;	      
	listNode refrence4;       
	listNode refrence5;       
	listNode loc=null;	     
	listNode predloc=null;   
	listNode predloc2=null;   
	int count1=0;
	int original_id=0;
	
	
	public void calindex(int id)   
	{
		this.id=(id%10);
	}
	public int getid()				
	{
		return (this.id);
	}
	public void setid(int id)		
	{

		original_id=id;
	}
	public int getoriginalid()         
	{
		return original_id;
	}
	public void setaddress(listNode re)   
	{
		refrence2=re;
	}
	public listNode getaddress()			
	{
		return refrence2;
	}



	public void insert_name(String name)  
	{
		insert_name(list,name);
	}
	private void insert_name(listNode newNode,String name) 
	{


		if(newNode.value==getid() && newNode.below==null && count1!=0)   
		{
			if(newNode.next==null)
			{
				newnode=new listNode();
				newnode.names=name;
				newnode.emp_id=getoriginalid();
				newnode.next=null;
				newNode.next=newnode;
				count1++;
			}
			else if(newNode.next!=null)		
			{
				listNode refrence6=newNode;
				while(refrence6!=null){
					if(refrence6.next==null)
					{
						break;
					}
					else
					{
						refrence6=refrence6.next;
					}

				}
				newnode=new listNode();
				newnode.names=name;
				newnode.emp_id=getoriginalid();
				newnode.next=null;
				refrence6.next=newnode;
			}
		}

		else if(newNode.value==getid() && newNode.below==null && count1==0)   
		{
			newnode=new listNode();
			newnode.names=name;
			newnode.next=null;
			newnode.emp_id=getoriginalid();
			newNode.next=newnode;
		}
		
		
		else
		{
			insert_name(newNode.below,name);    
		}
	}
	public void insert()      
	{ 

		list=insert(list);
	}
	private listNode insert(listNode newNode) 

	{
		if(newNode==null)   
		{
			newNode=new listNode();
			newNode.value=getid();     
			newNode.below=null;
			newNode.next=null;


		}

		else
		{
			if(newNode.value<getid())  
			{
				newNode.below=insert(newNode.below);
			}
			else if(newNode.value>getid()){       
				listNode refrence7=newNode;
				listNode refrence8=insert(newNode.below);
				newNode=refrence8;
				
			}
		}

		return newNode;   
	}
	public void search_id(int id)  
	{
		searchindex(list,id); 
		search_id(refrence4,id);

	}
	public void searchindex(listNode searchindex,int id)  
	{
		
			if(searchindex.value==getid()) 
			{
				refrence4=searchindex.next;
			}
			else if(searchindex.below!=null)
			{
				searchindex(searchindex.below,id);   
			}
	}


	protected void search_id(listNode search,int id)  
	{	
		
		{
			if(search.emp_id==id)
			{
				loc=search; 
				System.out.println("Emp id: "+search.emp_id);   
				System.out.println("Name: "+search.names);		
			}
			else if(search!=null)
			{
				predloc=search; 
				search=search.next;
				search_id(search,id);
			}
		}
		

	}
	public void delete(int id)  
	{
		search_id(id);
		if(loc.next!=null)
		{
				predloc.next=loc.next;   
				
			
		}
		else if(loc.next==null && predloc==null) 
		{ 
			predloc2=getaddress(); 
			predloc2.next=null;
			
		}
		else if(loc.next==null && predloc!=null) 
		{ 
			predloc.next=null;
		}
		


	}
	public void print() 
	{
		print1(list); 
	}
	private void print1(listNode refrence9) 
	{
		if (refrence9.below!= null)
		{
			print1(refrence9.below);
		}

				System.out.println("Name: "+refrence9.names);  
				System.out.println("ID: "+refrence9.emp_id);   
			
	
		}
	
	public static void main(String[] args)
	{
		Hashing obj = new Hashing();
		obj.insert_name("sad");
		obj.getid();
	}
		
		
}
