package assignment;

import java.util.Scanner;



class treeNode

{

	treeNode leftNode, rightNode;

	int data;

	public treeNode()

	{

		leftNode = null;

		rightNode = null;

		data = 0;

	}


	public treeNode(int item)

	{

		leftNode = null;

		rightNode = null;

		data = item;

	}



	public void setLeftNode(treeNode node)

	{

		leftNode = node;

	}



	public void setRightNode(treeNode node)

	{

		rightNode = node;

	}



	public treeNode getLeft()

	{

		return leftNode;

	}


	public treeNode getRight()

	{

		return rightNode;

	}


	public void setData(int item)

	{

		data = item;

	}

	public int getData()

	{

		return data;

	}     

}




class BinarySearchTree

{

	treeNode root;




	public BinarySearchTree()

	{

		root = null;

	}



	public boolean isEmpty()

	{

		return root == null;

	}





	public void insertnode(int key){
		if(root==null)
			root=new treeNode(key);
		else{
			treeNode r1,r2;
			r1=r2=root;
			while(r1!=null){
				if(key==r1.getData())
					break;
				else if(key>r1.getData()){
					r2=r1;
					r1=r1.getRight();
				}
				else{
					r2=r1;
					r1=r1.getLeft();
				}
			}
			if(r2.getData()<key){
				r1=new treeNode(key);
				r2.setRightNode(r1);
			}
			else{
				r1=new treeNode(key);
				r2.setLeftNode(r1);
			}
		}
	}
	
	
	
	public void delete(int k)

	{

		if (isEmpty())

			System.out.println("Tree Empty");

		else if (search(k) == false)

			System.out.println("Sorry "+ k +" is not present");

		else

		{

			deleteUsingleftSubTree(k);

			System.out.println(k+ " deleted from the tree");

		}

	}

	

	void deleteUsingleftSubTree(int value){
		treeNode p;
		treeNode q;
		p = q = root;
		while(p != null)
		{
			if (value == p.getData() )
				break;
			if (value > p.getData() )
			{
				q = p;
				p = p.getRight();
			}
			else
			{
				q = p;
				p = p.getLeft();
			}
		} 
		if( p.getLeft()!= null && p.getRight()!=null)
		{
			treeNode temp=p;
			q = p;

			p = p.getLeft(); 
			while(p.getRight()!=null) 
			{
				q = p;
				p = p.getRight();
			}
			temp.setData(p.getData());

		}



		if( p.getLeft() == null && p.getRight() == null) 
		{
			if(q.getRight() == p)
				q.setRightNode(null);
			else
				q.setLeftNode(null);
		}


		if( p.getLeft()==null && p.getRight()!=null)
		{
			if(root==p)
			{
				root=p.getRight();;
			}
			else if ( q.getRight() == p)
				q.setRightNode(p.getRight());
			else
				q.setLeftNode(p.getRight());
		}

		if( p.getLeft() != null && p.getRight() == null)
		{
			if(root==p)
			{
				root=p.getLeft();
			}
			else if(q.getRight() == p)
				q.setRightNode(p.getLeft());
			else
				q.setLeftNode(p.getLeft());

		}


	}         


	public int countNodes()

	{

		return countnonleafNodes(root);

	}


	int count=0;   //for counting non-leaf nodes
	int count1=0;  //for counting leaf nodes 
	
	
	int countnonleafNodes(treeNode r)

	{

		if (r != null && r.getLeft()!=null && r.getRight()!=null){

			count++;
			countnonleafNodes(r.getLeft());
			countnonleafNodes(r.getRight());
		}
		else if(r!=null && r.getLeft()==null && r.getRight()!=null )
		{
			count++;
			countnonleafNodes(r.getRight());
		}
		else if(r!=null && r.getLeft()!=null && r.getRight()==null )
		{
			count++;
			countnonleafNodes(r.getLeft());
		}

		return count;
	}

	
	public int countleaf()
	{
		return countleafnode(root);
	}
	
	
	public int countleafnode(treeNode node)
	{
		if(node!=null && node.getLeft()==null && node.getRight()==null)
		{
			count1++;
		}
		if(node==null)
		{

		}
		else
		{
			countleafnode(node.getLeft());
			countleafnode(node.getRight());
		}
		return count1;
	}
	
	
	public int getcountleafnode()
	{
		return count1;
	}

	
	public int getnode()
	{
		return count;
	}
	
	
	public void totalnodes()
	{
		total(root);
	}
	
	
	int total1=0;
	
	
	public void total(treeNode node)
	{
		if(node!=null)
		{
			total1++;
			total(node.getLeft());
			total(node.getRight());

		}

	}
	
	
	public int gettotal()
	{
		return total1;
	}
	
	
	public boolean search(int val)

	{

		return search(root, val);

	}



	private boolean search(treeNode r, int val)

	{

		boolean found = false;

		while ((r != null) && !found)

		{

			int rval = r.getData();

			if (val < rval)

				r = r.getLeft();

			else if (val > rval)

				r = r.getRight();

			else

			{

				found = true;

				break;

			}

			found = search(r, val);

		}

		return found;

	}


}






public class Assignment
{
    public static void main(String[] args)
   {                 
       Scanner input = new Scanner(System.in);
      
       BinarySearchTree object = new BinarySearchTree();       
       char ch;
    
       do    
       {
           System.out.println("\nBinary Search Tree\n");
           System.out.println("1. Insert: ");
           System.out.println("2. Delete: ");
           System.out.println("3. Search:");
           System.out.println("4. Count Nodes");
           System.out.println("5. Count leaf nodes:");
           System.out.println("6. Count Non-Leaf nodes:");
           
           int i = input.nextInt();            
           switch (i)
           {
           case 1 : 
               System.out.println("insert item: ");
               object.insertnode( input.nextInt() );                     
               break;                          

           case 2 : 
               System.out.println("delete item: ");
              
               object.deleteUsingleftSubTree(input.nextInt());
               break;                         

           case 3 : 
               System.out.println("search item: ");
               System.out.println("result : "+ object.search( input.nextInt() ));
               break;                                          
           case 4 : 
               System.out.println(" total Nodes = "+ object.countNodes());
               break;    
           case 5 : 
               System.out.println(" leaf Nodes = "+ object.countleafnode(object.root));
               break; 
           case 6 : 
               System.out.println(" Internal Nodes = "+ object.countnonleafNodes(object.root));
               break; 
                    
           default : 
               System.out.println("error \n ");
               break;   
           }
           
           System.out.println("\n Press Y to continue and N to exit (Type y or n) \n");
           ch = input.next().charAt(0);                        
       } while (ch == 'Y'|| ch == 'y');               
   }
}