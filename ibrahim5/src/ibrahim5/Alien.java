package ibrahim5;

abstract class Alien {
	protected String name;
	 
	   protected int health;
	     
	   
	   public String info()
	  {

	   return "Name of Alien: "+this.name+ "\nHealth: " +this.health;

	     }  
	   
	  public static int Damage(Alien[] arr)
	{

	  	 int  loss=0;
		     
	    
	for(int counter=0;counter<arr.length;counter++)
	{
	   if(arr[counter] instanceof Snake)
	{

	  loss=loss+ Snake.getDamage();
		    
	   	}
	    else if(arr[counter] instanceof Ogre)
	{

	loss=loss+ Ogre.getDamage();
		       	
	  }
		       	
	  else if(arr[counter] instanceof Marshmallow)
	{
	loss=loss+ Marshmallow.getDamage();
		     
	}

	 }
		    
	 return loss;
	  
	  }

	      public int getHealth() 
	{

	return health;
	     
	}

	  
	    public String getName() 
	{
	 
	return name;
	    
	  }

	    
	  public void setName(String name)
	 {
	 
	this.name = name;

	 }


	      public void setHealth(int health) {
	 	
	 this.health = health;
	 
	     }

	   

	}


class Marshmallow extends Alien {
	public static int getDamage(){
	  	   
		return 1;
		     
		}
			 
			 
		public int getHealth() {
				 	
		return this.health;
			 
		}

			 
		public String getName() {
			 		
		return this.name;
			 
		}

			 
		public void setName(String name) {
			 		
		this.name = name;
			
		 }

			 
		public void setHealth(int health) {
				 	
		this.health = health;
			
		 }
		    
		     
		public String toString(){
		    	 
		return "Name of Alien: " +this.getName()+ "\nHealth: " +this.getHealth()+ "\nAlien type: Marshmallow Alien" + "\nDamage power: "+ Marshmallow.getDamage();
		    
		}


		}

class Ogre extends Alien {
	public static int getDamage(){
	  	   
		return 6;
			     
		}
				 
				 
		public int getHealth() {
					 	
		return this.health;
				 
		}

				
		 public String getName() {
				 		
		return this.name;
				 
		}

				
		 public void setName(String name) {
				 		
		this.name = name;
				 
		}

				
		 public void setHealth(int health) {
					 	
		this.health = health;
				 
		}
			
			
		      
		public String toString(){              
		  //using accessor//
		     	 
		return "Name of Alien: " +this.getName()+ "\nHealth: " +this.getHealth()+ "\nAlien type: Ogre Alien" + "\nDamage power: " +Ogre.getDamage();
		    
		  }

		}

class Snake extends Alien {

    
public static int getDamage(){
	  	
return 10;
	
}
    
	
 public int getHealth() {
		 	
return this.health;
	
 }

	 
public String getName() {
	 		
return this.name;
	 
}

	 
public void setName(String name) {
	 		
this.name = name;
	
 }

	 

public void setHealth(int health) {
		 	
this.health = health;
	 
}
    
    
    
public String toString(){          
    	
return "Name of Alien: " +this.getName()+ "\nHealth: " +this.getHealth()+ "\nAlien type: Snake Alien" + "\nDamage power:" +Snake.getDamage();
    
}

}





class Test {

	public static void main(String[] args) 
	{
		Alien[] arr = new Alien[3];
		
		Snake s1 = new Snake();
				
		Ogre o1=new Ogre();
				
		Marshmallow m1=new Marshmallow();
			   
				   
		s1.setName("mateen");
				   
		s1.setHealth(4);
				   
		o1.setName("moiez");
				   
		o1.setHealth(9);
				   
		m1.setName("abcd");
				   
		m1.setHealth(0);
				      
		arr[0]=s1;
				      
		arr[1]=o1;
				      
		arr[2]=m1;
			  
		for (int count=0;count<arr.length;count++){
				  
		System.out.println(arr[count]);
			  }
			  
			  	
		System.out.println("Total Damage done:" +Alien.Damage(arr));
			

	}

}






