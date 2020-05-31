
/*
  	FINAL PROJECT: 
  		HASHING 
  		(USING AVL TREE APPROACH AND LINKED LIST) 

  	GROUP MEMBERES:

       	S.M Ibrahim Azam FA13-BCS-093
		Mateen Sheikh FA13-BCS-066
	
 */


package hash;

import java.util.Scanner;


/*==== MAIN HASHING CLASS ====*/

public class hashing {

	/*==== HASHTABLE NODE CLASS ====*/

	protected class hashnode{
		protected int index;
		protected hashnode below;
		protected avlnode next;

		/*==== CONSTRUCTORS ====*/

		protected hashnode(){
			index = 0;
			below = null;
			next = null;
		}
		protected hashnode(int i){
			index = i;
			below = null;
			next = null;
		}
		protected hashnode(int i, hashnode b){
			index = i;
			below = b;
			next = null;
		}

		/*==== CONSTRUCTORS ENDS ====*/

	}

	/*==== HASHTABLE NODE CLASS ENDS ====*/



	/*==== AVL NODE CLASS ====*/

	protected class avlnode{
		protected int info, height;
		protected avlnode left, right;

		/*==== CONSTRUCTORS ====*/

		protected avlnode(){
			left = null;
			right = null;
			info = 0;
			height=0;
		}

		protected avlnode(int n){
			left = null;
			right = null;
			info = n;
			height=0;
		}

		/*==== CONSTRUCTORS ENDS ====*/


				/*==== METHOD TO SET LEFT ====*/

		public void setleft(avlnode n){
			left = n;
		}

		/*==== METHOD TO SET LEFT ENDS ====*/



		/*==== METHOD TO SET RIGHT ====*/

		public void setright(avlnode n){
			right = n;
		}

		/*==== METHOD TO SET RIGHT ENDS ====*/



		/*==== METHOD TO GET LEFT ====*/

		public avlnode getleft(){
			return left;
		}

		/*==== METHOD TO GET LEFT ENDS ====*/



		/*==== METHOD TO GET RIGHT ====*/

		public avlnode getright(){
			return right;
		}

		/*==== METHOD TO GET RIGHT ENDS ====*/


		/*==== METHOD TO SET INFO ====*/

		public void setinfo(int d){
			info = d;
		}         

		/*==== METHOD TO SET INFO ENDS====*/


		/*==== METHOD TO GET INFO ====*/

		public int getinfo(){
			return info;
		}

		/*==== METHOD TO GET INFO ENDS ====*/

	}

	/*==== AVL NODE CLASS ENDS ====*/


	protected hashnode hashlist,loc;

	/*==== MAIN CLASS CONSTRUCTOR ====*/

	public hashing(){
		hashlist = null;
		loc = null;
	}

	/*==== MAIN CLASS CONSTRUCTOR ENDS ====*/



	/*==== CHECK EMPTY METHOD ====*/

	public boolean isEmpty(){
		if(this.hashlist==null) 
			return true;
		else
			return false;
	}

	/*==== CHECK EMPTY METHOD ENDS ====*/



	/*==== HASH INDEXING METHOD ====*/

	public void hash(int input){
		int hashindex = input % 10;
		insert(hashindex,input);
	}

	/*==== HASH INDEXING METHOD ENDS ====*/



	/*==== METHODS FOR INSERTION IN HASHTABLE ====*/

	public void insert (int item,int value){
		loc=null;
		loc=hashlist;
		if (loc==null && loc == hashlist){
			hashnode newnode = new hashnode(item);
			newnode.below = loc;
			avlnode newavl = new avlnode(value);
			newnode.next = newavl;
			hashlist = newnode;
		}else{
			insertsorted(loc,item,value);
		}
	}

	public void insertsorted(hashnode loc,int itemno,int value){

		if(loc.index==itemno){
			System.out.println("index exists");
			loc.next = insertavl(loc.next,value);
		}else if (loc.index>itemno){
			hashnode newnode = new hashnode(itemno,loc);
			avlnode newavl = new avlnode(value);
			newnode.next = newavl;
			System.out.println(itemno+" added before "+loc.index);
			if(loc == hashlist){
				hashlist = newnode;
			}
		}else if((loc.index<itemno) && (loc.below==null)){
			hashnode newnode = new hashnode(itemno);
			loc.below = newnode;
			avlnode newavl = new avlnode(value);
			newnode.next = newavl;
			System.out.println(itemno+" added after "+loc.index);
		}else if((loc.index<itemno) && ((loc.below).index>itemno)){
			hashnode newnode = new hashnode(itemno,(loc.below));
			avlnode newavl = new avlnode(value);
			newnode.next = newavl;
			System.out.println(itemno+" added before "+(loc.below).index);
			loc.below = newnode;
		}else{
			System.out.println("called");
			insertsorted(loc.below,itemno,value);
		}
	}

	/*==== METHODS FOR INSERTION IN HASHTABLE ENDS ====*/



	/*==== METHODS FOR INSERTION IN AVL TREES ====*/

	public avlnode insertavl(avlnode node, int data){
		int x;
		if (node == null)
			node = new avlnode(data);
		else if (data < node.getinfo()){
			node.left = insertavl(node.left, data);
			x= height( node.left ) - height( node.right );

			if( x == 2||x== -2 ){
				if( data < node.left.info )
					node = rightrotation( node );
				else
					node = doubleWithLeftChild( node );
			}
		}else{
			node.right = insertavl(node.right, data);
			x=height( node.right ) - height( node.left );

			if(x == 2 || x== -2 ){
				if( data > node.right.info)
					node = leftrotation( node );
				else
					node = doubleWithRightChild( node );
			}
		}
		if (height(node.left)>height(node.right)){
			node.height=height(node.left)+1;
		}else{
			node.height=height(node.right)+1;
		}
		return node;
	}

	/*==== METHODS FOR INSERTION IN AVL TREES ENDS ====*/



	/*======== ROTATION METHODS ========*/


	/*==== RIGHT ROTATION ====*/

	private avlnode rightrotation(avlnode node){
		avlnode x= node;
		avlnode y = node.left;
		x.left = y.right;
		y.right = x;
		if (height(x.left)>height(x.right)){
			x.height=height(x.left)+1;
		}else{
			x.height=height(x.right)+1;}
		if (height(y.left)>height(y.right)){
			y.height=height(y.left)+1;
		}else{
			y.height=height(y.right)+1;
		}
		return y;
	}

	/*==== RIGHT ROTATION ENDS====*/

	/*==== LEFT ROTATION ====*/

	private avlnode leftrotation(avlnode node){
		avlnode x= node;
		avlnode y = node.right;
		x.right = y.left;
		y.left = x;
		if (height(x.left)>height(x.right)){
			x.height=height(x.left)+1;
		}else{
			x.height=height(x.right)+1;}
		if (height(y.left)>height(y.right)){
			y.height=height(y.left)+1;
		}else{
			y.height=height(y.right)+1;
		}
		return y;
	}

	/*==== LEFT ROTATION ENDS====*/


	/*==== DOUBLE LEFT ROTATION ====*/

	private avlnode doubleWithLeftChild(avlnode node){
		node.left = leftrotation( node.left );
		return rightrotation(node);
	}    

	/*==== DOUBLE LEFT ROTATION ENDS====*/


	/*==== DOUBLE RIGHT ROTATION ====*/

	private avlnode doubleWithRightChild(avlnode node){
		node.right = rightrotation(node.right );
		return leftrotation(node);
	}

	/*==== DOUBLE RIGHT ROTATION ENDS ====*/

	/*======== ROTATION METHODS ========*/



	/*==== HEIGHT METHOD ====*/

	private int height(avlnode node ){
		if(node==null){
			return -1;
		}else{
			return node.height;
		}
	}

	/*==== HEIGHT METHOD ENDS ====*/



	/*======== SEARCHING METHODS========*/


	public boolean search(int val){
		boolean indexfound = false;
		int indexsearch = val%10;
		loc= hashlist;
		while(loc!=null && indexfound!=true){
			if(loc.index == indexsearch){
				indexfound = true;
				break;
			}else if(loc.index>indexsearch){
				break;
			}else{
				loc = loc.below;
			}
		}
		if (indexfound == false){
			System.out.println("value not found");
			return indexfound;
		}
		return search(loc.next, val);
	}
	private boolean search(avlnode r, int val){
		boolean found = false;
		while ((r != null) && !found){
			int rval = r.info;
			if (val < rval)
				r = r.left;
			else if (val > rval)
				r = r.right;
			else if (val == rval){
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	/*======== SEARCHING METHODS END ========*/


	/*======== DELETION METHODS ========*/

	public void delete(int val){
		boolean indexfound = false;
		int indexsearch = val%10;
		hashnode predloc;
		loc = hashlist;
		predloc = hashlist;
		while(loc!=null && indexfound!=true){
			if(loc.index == indexsearch){
				indexfound = true;
				deleteavl(loc.next, val);
				if(loc.next == null){
					if (loc == hashlist){
						hashlist= loc.below;
						loc = null;
					}else{
						predloc.below = loc.below;
						loc = null;
					}
				}
				break;
			}else if(loc.index>indexsearch){
				break;
			}else{
				predloc = loc;
				loc = loc.below;
			}
		}
		if (indexfound == false){
			System.out.println("value not found");
		}
	}

	public void deleteavl(avlnode root, int value){
		int x;
		avlnode current1, current2;
		current1 = current2 = root;
		while(current1 != null){
			if (value == current1.getinfo() )
				break;
			if (value > current1.getinfo() ){
				current2 = current1;
				current1 = current1.getright();
			}else if(value<current1.getinfo()){
				current2 = current1;
				current1 = current1.getleft();
			}
		}
		if( current1.getleft()!= null && current1.getright()!=null){
			avlnode temp=current1;
			current2 = current1;
			current1 = current1.getleft();

			while(current1.getright()!=null){
				current2 = current1;
				current1 = current1.getright();
			}

			temp.setinfo(current1.getinfo());

			x= height( temp.left ) - height( temp.right );

			if(x >= 2 || x<= -2 ){
				if( value < (temp.left).info )
					temp = rightrotation( temp );
				else
					temp = doubleWithLeftChild( temp );
			}
			if(x >= 2 || x<= -2 ){
				if( value > (temp.right).info)
					temp = leftrotation( temp );
				else
					temp = doubleWithRightChild( temp );
			}
		}

		if( current1.getleft() == null && current1.getright() == null){
			if(current2.getright() == current1){
				current2.setright(null);
			}else{
				current2.setleft(null);
			}
		}

		if( current1.getleft()==null && current1.getright()!=null){
			if ( current2.getright() == current1){
				current2.setright(current1.getright());
			}else{
				current2.setleft(current1.getright());
			}


			x= height( current2.left ) - height( current2.right );
			if(x >= 2 || x<= -2 ){
				if( value < (current2.left).info )
					current2= rightrotation( current2 );
				else
					current2 = doubleWithLeftChild(current2 );
			}
			if(x >= 2 || x<= -2 ){
				if( value > (current2.right).info)
					current2 = leftrotation( current2 );
				else
					current2 = doubleWithRightChild( current2 );
			}

		}
		if( current1.getleft() != null && current1.getright() == null){
			if(current2.getright() == current1){
				current2.setright(current1.getleft());
			}else{
				current2.setleft(current1.getleft());
			}

			x= height( current2.left ) - height( current2.right );
			if(x >= 2 || x<= -2 ){
				if( value < (current2.left).info )
					current2= rightrotation( current2 );
				else
					current2 = doubleWithLeftChild(current2 );
			}
			if(x >= 2 || x<= -2 ){
				if( value > (current2.right).info)
					current2 = leftrotation( current2 );
				else
					current2 = doubleWithRightChild( current2 );
			}
		}
		System.out.println("Deleted");
	}


	/*======== DELETION METHODS END========*/



	/*======== PRINTING METHODS ========*/


	/*==== PRINTS HASHINDEXS ====*/

	public void printList(){
		hashnode loc = hashlist; 
		if(loc==null){ 
			System.out.println("List is Empty");
		}else{ 
			System.out.println("Printing List");
			for(loc=hashlist;loc!=null;loc=loc.below){ 
				System.out.println(" ");
				System.out.println(loc.index+" :");
				preorder(loc.next);
			}
		}
	}

	/*==== PRINT HASHINDEXS ENDS====*/

	/*==== PRINTS AVL TREE ====*/

	public void preorder(avlnode node){
		if (node != null){
			System.out.print(" ");
			System.out.print(node.info +" ");
			preorder(node.left);             
			preorder(node.right);
		}
	}

	/*==== PRINT AVL TREE ENDS====*/


	/*==== PRINTING METHODS END ====*/



	/*==== MAIN METHOD STARTS ====*/

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		hashing lst = new hashing();				/*==== CREATING OBJECT FOR HASHTABLE ====*/
		boolean continuemm = true;

		/*==== DO WHILE STARTS ====*/

		do{

			System.out.println("Welcome to user interface \n press: \n1 to display data\n2 to add data\n3 to search data\n4 to delete data\n0 to exit");
			int m = input.nextInt();

			/*==== SWITCH STARTS ====*/

			switch (m){

			/*==== PRINTING CASE ====*/

			case 1:
				lst.printList();
				System.out.println("\nEnter any key");
				char a = input.next().charAt(0);
				break;

				/*==== INSERTION CASE ====*/

			case 2:
				System.out.println("enter number of values you want to insert: "); 
				int n = input.nextInt();
				for(int f=0;f<n;f++){
					System.out.println("enter value: ");
					int i = input.nextInt();
					lst.hash(i);
				}
				break;

				/*==== SEARCHING CASE ====*/

			case 3:
				System.out.println("enter value you want to search: "); 
				int s = input.nextInt();
				System.out.println("search result: "+lst.search(s));
				break;

				/*==== SEARCHING CASE ====*/

			case 4:
				System.out.println("enter value you want to delete: "); 
				int d = input.nextInt();
				lst.delete(d);
				break;	

				/*==== EXIT MAIN MENU CASE ====*/

			case 0:
				continuemm = false;
				break;

				/*==== DEFAULT ====*/
			}

			/*==== SWITCH ENDS ====*/

		} while(continuemm=true);

		/*==== DO WHILE ENDS ====*/

	}

	/*==== MAIN METHOD ENDS ====*/

}

/*==== MAIN HASHING CLASS ENDS ====*/
