package array;

import java.util.Scanner;

public class twoDimArray
{

		
	public static void main(String[] args)
	{
		int twoDim [][] = new int [5][3];

	
		Scanner input = new Scanner(System.in);
		
		for(int count=0 ; count<3 ; count++)
		{
			
			System.out.println("Enter marks of student "+(count+1));
			
			for(int count1=0 ; count1<5 ; count1++)
			{
				System.out.print("Enter marks of Subject "+(count1+1)+" : ");
				twoDim[count1][count] = input.nextInt();
			}
		}
		
		for(int count=0 ; count<5 ; count++)
		{
			
			for(int count1=0 ; count1<3 ; count1++)
			{	
				System.out.print(twoDim[count][count1]+"\t");		
			}
			System.out.println();
		}
	

}

}