package depthfirst;




class Stack 
{


    protected class ListNode 
    {
        protected int info;
        protected ListNode next;
    }
    
    private ListNode top;
    
    
    Stack()
    {
        top = null;
    }
    
    public boolean isEmpty() 
    {
        return top == null;
    }
    
    public void Push(int info) 
    {
        ListNode newNode = new ListNode();
        newNode.info = info;
    
        if(isEmpty()) 
        {
            newNode.next = null;
            top = newNode;
        }
        else 
        {
            newNode.next = top;
            top = newNode;
        }
    }
    
    public int Pop() 
    {
        if(isEmpty()) 
        {           
            return '0' ;
        }           
        int val = top.info;
        top = top.next;
        return val;
    }
   


}



public class DFT 
{

    Stack stack = new Stack();
      int first;

      int[][] matrix;
      int[] Visited = new int[6];

    
   
    public DFT(int[][] matrix)
    {

         this.matrix = matrix;
         
         int i = 0;
         int[] node = {0, 1, 2, 3, 4, 5};
         int firstNode = node[0];
         depthFirst(firstNode, 6);



    }

          public void depthFirst(int first,int n)
          {
	          int v,i;
	
	          stack.Push(first);
	
	          while(!stack.isEmpty())
	          {
	              v = stack.Pop();
	              if(Visited[v]==0)
	              {
	                  System.out.print("\n"+(v+1));
	                  Visited[v]=1;
	              }
	              for ( i=0;i<n;i++)
	              {
	                  if((matrix[v][i] == 1) && (Visited[i] == 0))
	                  {
	                      stack.Push(v);
	                      Visited[i]=1;
	                      System.out.print(" " + (i+1));
	                      v = i;
	                  }
	              }
	          }

           
          }
          
          
  
	public static void main(String[] args)
	{
		
		        int[][] matrix = { 
		        		
		        		{0, 1, 1, 0, 1, 0},
		                {1, 0, 1, 0, 0, 1},
		                {1, 1, 0, 1, 0, 0},
		                {0, 0, 1, 0, 1, 1},
		                {1, 0, 0, 1, 0, 0},
		                {0, 1, 0, 1, 0, 0},
		                
		        };


		      new DFT(matrix);

	}
}