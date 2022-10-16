package com.blz.assignment04;

import java.util.Random;

public class SnakeLadderProgram {

	static final int ladder = 1;
	static final int snake = 2;
	static int noplay = 0;

	public static void main(String args[]) {
//WELCOME MESSAGE FOR SNAKE & LADDDER PROGRAM
		System.out.println("Welcome To Snake And Ladder Simulater program");

//		UC--1
		int position = 0;
		int count = 0;

		System.out.println("Start position=" + position);

		Random r = new Random();

		int dice = r.nextInt(6) + 1;

		System.out.println("Dice outcome is=" + dice);

		count++;

		System.err.println("Total count=" + count);

// PLAYER CHECK FOR OPTION uc-3

		System.out.println("Start position=" + position);

		System.out.println("Dice outcome is=" + dice);

		int optionCheck = r.nextInt(3);

		System.out.println("Option Check=" + optionCheck);

		if (optionCheck == ladder) {

			System.err.println("It is Ladder");

			position = position + dice;

		} else if (optionCheck == snake) {

			System.err.println("It Is snake");

			position = position - dice;
		} else {

			System.out.println("No play");
		}

		count++;

		System.err.println("Toatl Count= " + count);
	}
}

