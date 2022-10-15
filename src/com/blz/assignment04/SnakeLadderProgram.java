package com.blz.assignment04;

import java.util.Random;

public class SnakeLadderProgram {

	public static void main(String args[]) {
//WELCOME MESSAGE FOR SNAKE & LADDDER PROGRAM
		System.out.println("Welcome To Snake And Ladder Simulater program");
		
		int position=0;
		int count=0;
		
		System.out.println("Start position="+position);
		
		Random r=new Random();
		
		int dice=r.nextInt(6)+1;
		
		System.out.println("Dice outcome is="+dice);
		
		count++;
		
		System.err.println("Total count="+count);
	}


		
	}

