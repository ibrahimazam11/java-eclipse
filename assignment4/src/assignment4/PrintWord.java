package assignment4;
import java.util.Scanner;  
public class PrintWord extends Thread {
	private String word;
	private int TimeDelay;
	             
	public PrintWord(String whatToSay, int delayTime) {    
	word = whatToSay; 
	TimeDelay = delayTime;   
	}    

    public void run() { 
    	try {      
    		for (int i = 0;;i++) {   
    			System.out.print(word + " ");       
    			sleep(TimeDelay);   
    	   }      
    	} catch (InterruptedException e) { 
    		return;   
    		}
    	} 
            public static void main(String[] args) {      
    		String S1 = null;
    		int n = 0 ;  
    		int not ;    
    		PrintWord[] p = new PrintWord[100];
    		Scanner input = new Scanner(System.in);   
    		System.out.println("Enter the number of Threads you Want to create: "); 
    		not = input.nextInt(); 
    		for(int i = 1;i<=not;i++){   
    			System.out.println("Enter Word in thread "+ i);   
    			S1 = input.next(); 
    			System.out.println("Enter time for Thread "+i); 
    			n = input.nextInt();    
    			p[i] = new PrintWord(S1,n); 
    			   
    			}
    		for(int i = 1;i<=not;i++){
    		p[i].start();
    		}
    	}
    	
    		}
    	
    