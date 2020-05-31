package quiz;

import java.util.Random;
/*
public class game 
{
	Random r = new Random();
	int Low = 0;
	int High = 2;
	int Result = r.nextInt(High-Low) + Low;
	
	int scissor = 0;
	int rock = 1;
	int paper = 2;
	
	
}*/


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class game {
	public static void main(String[] args){
		Scanner input = new Scanner(System. in );
		Random rnd = new Random();
		
		int You=0, Computer=0, Draw=0;
		int loop = 1;
		
		while (loop == 1) {
			
			int Scissor = 0, Rock = 1, Paper = 2 ;
			
			System.out.println("Pick 0, 1, or 2 for:");
			System.out.println("SCISSOR (0), ROCK (1), PAPER(2) ");

			
			int randomNumber = rnd.nextInt(3);
			
			
			
			if (randomNumber == Rock) 
			{
				int x = input.nextInt();
				
				if(x == randomNumber)
				{
					System.out.println("The computer is rock, You are rock too. It is a draw");
					Draw++;
				
				}else if(x < randomNumber )
				{
						System.out.println("The computer is rock, you are scissor. You lose");
						Computer++;
				}else if(x > randomNumber)
				{
					System.out.println("The computer is rock, you are paper. You Win");
					You++;
				}
			}
			
			if (randomNumber == Scissor) 
			{
				int x = input.nextInt();
				
				if(x == randomNumber)
				{
					System.out.println("The computer is scissor, You are scissor too. It is a draw");
					Draw++;
				
				}else if(x == 1 )
				{
						System.out.println("The computer is scissor, you are rock. You Win");
						You++;
				}else if(x == 2)
				{
					System.out.println("The computer is scissor, you are paper. You Lose");
					Computer++;
				}
			}
			
			if (randomNumber == Paper) 
			{
				int x = input.nextInt();
				
				if(x == randomNumber)
				{
					System.out.println("The computer is paper, You are paper too. It is a draw");
					Draw++;
				
				}else if(x == 1 )
				{
						System.out.println("The computer is paper, you are rock. You Lose");
						Computer++;
				}else if(x == 0)
				{
					System.out.println("The computer is paper, you are scissor. You Win");
					You++;
				}
			
			}
			
			
			System.out.println("Play Again? (Y/N)");
			
			
			char c;
			c = input.next().charAt(0);
			
			if(c == 'y')
			{
				loop = 1;
			}
			else if(c == 'n')
			{
				loop = 0;
			}
	}
		System.out.println("Scores: You:"+You);
		System.out.println("Scores: Computer:"+Computer);
		System.out.println("Scores: Draw:"+Draw);
		System.out.println("Bye!");
	}
}