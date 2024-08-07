package com.num;

import java.util.Scanner;

// number guessing game 
public class NumberGuess {

	public static void main(String[] args) {
		
	
		int num =  (int) (Math.random()*100);       // generating a random number 
		int userNum = 0;
		
		// using loop to guess the number 
		while(true)					// loop will execute until we guess the number 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number :");
			userNum = sc.nextInt();
			
			if(userNum > num)
			{
				System.out.println("Number to be guessed is smaller than you entered ");
			}
			else if(userNum < num) 
			{
				System.out.println("Number to be guessed is larger than you entered ");
			}
			else 
			{
				System.out.println("You Guessed the number right !! ");	
				break;
			}
		}
		
	}

}
