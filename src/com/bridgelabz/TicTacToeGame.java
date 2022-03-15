package com.bridgelabz;
import java.util.Scanner;

public class TicTacToeGame {
	   static int boardIndex;
		public static void main(String[] args) {
			int indexSize = 10;
		    char[] board = new char[10];
				int charIndex = 1;
				for(int i = 1; i <= 3; i++){	
					for(int j = 1; j <= 3; j++){
						System.out.print(" "+board[charIndex]+" ");
						charIndex++;
						if(j !=  3)
							System.out.print("|");
					}
					System.out.println("");
		}
}}
	
		
