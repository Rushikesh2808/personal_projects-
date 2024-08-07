package com.quiz;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		int ch;
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		// question 1 .. if correct answer then score increases by 10 
		System.out.println("Q1. What is the Capital of India ?");
		System.out.println("1.Mumbai  2.Pune  3.New Delhi  4.Goa");
		System.out.println("Enter option number : ");
		ch = sc.nextInt();
		if(ch == 3)
		{
			System.out.println("Correct answer ");
			score += 10;
		}
		else
		{
			System.out.println("Wrong answer ");
		}
		
		// question 2.. if correct answer then score increases by 10 
		System.out.println("Q2. Who is called as God of Cricket ?");
		System.out.println("1.Virat Kohli  2.Sachin Tendulkar  3.M S Dhoni  4.Rohit Sharma");
		System.out.println("Enter option number : ");
		ch = sc.nextInt();
		if(ch == 2)
		{
			System.out.println("Correct answer ");
			score += 10;
		}
		else
		{
			System.out.println("Wrong answer ");
		}
		
		// question 3 .. if correct answer then score increases by 10 
		System.out.println("Q3. who won IPL 2024 ?");
		System.out.println("1.MI  2.CSK  3.RCB  4.KKR");
		System.out.println("Enter option number : ");
		ch = sc.nextInt();
		if(ch == 4)
		{
			System.out.println("Correct answer ");
			score += 10;
		}
		else
		{
			System.out.println("Wrong answer ");
		}
		System.out.println("Quiz ended !!");
		System.out.println("Your score is : "+score);
	}

}
