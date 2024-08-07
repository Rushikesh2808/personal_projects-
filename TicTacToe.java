package com.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	char[][] board;
	 
	TicTacToe()
	{
		board = new char[3][3];	
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3;j++)
			{
				board[i][j] = ' ';
			}
		}
		
	}
	
	void mark(int r, int c, char player)
	{
		if(board[r][c] == 'X' || board[r][c] == 'O')
		{
			System.out.println("Box already occupied");
		}
		else if(player == 'X')
		{
			board[r][c]='X';
		}
		else if(player == 'O')
		{
			board[r][c]='O';
		}
	}
	
	void checkWinner(char cp,int i, int j)
	{
		// Check vertical winner for player X 
		if(cp == 'X' && (board[0][j]==board[1][j]  && board[1][j]==board[2][j]) )
		{
			System.out.println("X won");
			return;
		}
		// Check horizontal winner for player X
		else if(cp == 'X' && (board[i][0]==board[i][1]  && board[i][1]==board[i][2]) )
		{
			System.out.println("O won");
			return;
	    }
		// Check vertical winner for player O
		else if(cp == 'O' && (board[0][j]==board[1][j]  && board[1][j]==board[2][j]) )
		{
			System.out.println("O won");
			return;
		}
		// Check horizontal winner for player O
		else if(cp == 'O' && (board[i][0]==board[i][1]  && board[i][1]==board[i][2]) )
		{
			System.out.println("O won");
			return;
	    }
	
	}
	
	void dispBoard()
	{
		System.out.println("Current Board : ");
		for(int i=0; i<3;i++)
		{
			
			for(int j=0; j<3;j++)
			{
				System.out.print(board[i][j]);
				if(j<2)
					if(j<2)
						  System.out.print(" | ");
			}
			System.out.println();
			if(i<2)
				  System.out.println("---------");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TicTacToe t = new TicTacToe();
		t.dispBoard();
		char CurrPlayer;
		int turn = 0;
		int chances = 0;
		while(turn <9)
		{
			if(turn%2==0)
				CurrPlayer ='X';
			else
				CurrPlayer ='O';
			
			turn++;
			chances++;
			System.out.println("Enter row and column for player :"+CurrPlayer);
			int row = sc.nextInt();
			//sc.next();
			int col = sc.nextInt();
			t.mark(row,col,CurrPlayer);
			t.dispBoard();
			
  			for(int i =0; i<3; i++)
			{
  				for(int j=0;j<3;j++)
  				{
  					if(chances>4)
  					t.checkWinner(CurrPlayer, i, j);
  				}
			}
		
			
		}
	}

}
