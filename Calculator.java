package com.calculator;

import java.util.Scanner;

public class Calculator {
	
	//add
	static void add(int n1, int n2)
	{
		System.out.println("Sum : "+(n1+n2));
	}
	//subtract
	static void sub(int n1, int n2)
	{
		System.out.println("Difference : "+(n1-n2));
	}
	//multiply 
	static void mul(int n1, int n2)
	{
		System.out.println("Product : "+(n1*n2));
	}
	//divide
	static void div(int n1, int n2)
	{
		if(n2 == 0)
			System.out.println("Error : dividing by Zero");
		else 
		    System.out.println("Division : "+(n1/n2));
	}
	 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	
		System.out.println("Choose Operation :\n 1.Addition\n 2.Subtraction\n3.Multiplication\n4.Division ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 : add(n1,n2);
		  break;
		case 2 : sub(n1,n2);
		  break;
		case 3 : mul(n1,n2);
		  break;
		case 4 : div(n1,n2);
		  break;
		default : System.out.println("Invalid choice ");
		}
	}

}
