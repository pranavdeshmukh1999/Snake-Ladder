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

//				UC4=Repeat till Winning Position

		Random rn = new Random();

		int dice1 = rn.nextInt(6) + 1;

		System.out.println("dice= " + dice1);

		int OptionCheck1 = rn.nextInt(3);

		System.out.println("OptionCheck=" + OptionCheck1);

		if (OptionCheck1 == ladder) {

			while (noplay < 100) {

				Random rn1 = new Random();

				int dice11 = rn1.nextInt(6) + 1;

				System.out.println("dice= " + dice11);

				int OptionCheck = rn1.nextInt(3);

				System.out.println("OptionCheck=" + OptionCheck);

				if ((OptionCheck == ladder) && (noplay + dice11) < 100) {

					System.out.println("ladder=");

					noplay = noplay + dice11;

					System.out.println("Position= " + noplay);

				} else if (OptionCheck == snake) {

					System.out.println("snake=");

					noplay = noplay - dice11;

					System.out.println("Position= " + noplay);
				} else {

					System.out.println("Noplay");

				}
				if (noplay < 0) {

					noplay = 0;
					System.out.println("Position= " + noplay);

				} else if (OptionCheck1 == snake) {

					System.out.println("snake=");
					noplay = noplay - dice11;

				} else {

					System.out.println("Noplay");
				}
				if (noplay < 0) {

					noplay = 0;

					System.out.println("Position= " + noplay);
					
					
					
//										 UC - 5 , 6 & 7
					
					
					while (position < 100) {
						Random ran = new Random();
						System.out.println("dice: " + dice);

						System.out.println("dice: " + dice1);

						int optionCheck1 = ran.nextInt(3);
						System.out.println("optionCheck: " + optionCheck1);

						if ((optionCheck1 == count) && (position + dice) <= 100) {
							System.out.println("optionCheck: " + optionCheck1);

							if ((optionCheck1 == count) && (position + dice) <= 100) {
								System.out.println("Ladder");
								position = position + dice;
							} else if (optionCheck1 == snake) {

								System.out.println("Snake");
								position = position - dice;
							}

							else {
								System.out.println("Noplay");
							}
							if (position < 0) {
								position = 0;
							}
							if (position < 0) {
								position = 0;
							}
							System.out.println("position: " + position);
							System.out.println("position: " + position);
						}
					}
			
				}
			}
		}
	}
}
