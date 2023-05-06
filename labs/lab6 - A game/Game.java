// Linh Nguyen - Section 002

// Date 02/25/2022

// Assignment 6 - Create a game

/* Description: The rule sounds like rock, paper, scissor but it's a different version
 After a user enters a play round, he/she will choose the move in range 0 to 4 included while the
 computer randomly enters a move. Another method will decide whether computer/user wins and keep
 running until user stops their round. Finally, the program will compute how many times user/computer
 wins. There will be 5 methods used in this program. */

package game;

import java.util.*; // import both Scanner and Random

public class Game {

	public static void main(String[] args) {
		
		Scanner grab = new Scanner(System.in);
		
		Random rand = new Random();
		
		print_rules();
		
		int rounds = 0;
		
		int player_wins = 0;
		
		int computer_wins = 0;
		
		Boolean game_condition = choice_helper(grab);
		
		while (game_condition) {
			
			rounds++;
			
			String player_move = player(grab);
			
			System.out.println("Your move is " + player_move);
			
			String computer_move = comp(rand);
			
			System.out.println("The computer move is " + computer_move);
			
			// return true -> user wins
			if (winner(computer_move, player_move)) {
				player_wins++; 
				System.out.println("-> The user wins \n");
			} else {
				computer_wins++;
				System.out.println("-> The computer wins \n");
			}
			
			System.out.println("Do you want to play another round? \nEnter 'y' to play, enter 'n' to quit.");
			game_condition = choice_helper(grab);
		}
		
		System.out.println("Rounds played: " + rounds);
		System.out.printf("The user wins: %d times %n", player_wins);
		System.out.printf("The computer wins: %d times %n", computer_wins);
	}
	// 1st method - print the rules
	public static void print_rules() {
		
		System.out.println("During each round, players choose a move, which may be either \n"
				+ "Skadis, Tjusig, Klyket, Hovolm, or Pershult. The rules are: \n \n"
				+ "1. Pershult beats Klyket, Skadis \n"
				+ "2. Klyket beats Tjusig, Hovolm \n"
				+ "3. Tjusig beats Pershult, Skadis \n"
				+ "4. Skadis Beats Hovolm, Klyket \n"
				+ "5. Hovolm beats Pershult, Tjusig \n");

		System.out.println("Would you like to play a round of game? \nEnter 'y' to play, enter 'n' to quit.");
	}
	
	// 2nd method - check for valid input
	public static boolean choice_helper(Scanner grab) {
		
		String play_choice = grab.nextLine().toLowerCase();
		
		// check for valid input
		while ((!play_choice.equals("y")) && (!play_choice.equals("n"))) {
			
			System.out.println("Enter error! Please enter 'y' or 'n'.");
			
			play_choice = grab.nextLine().toLowerCase();
		}
		
		// check for input to play or quit game
		if (play_choice.equals("y")) {
			return true;
		} else if (play_choice.equals("n")) {
			System.out.println("Thank you for playing. \n");
			return false;
		}
		return false;
	}
	
	// 3rd method - get computer's move
	public static String comp(Random rand) {

		String computer_move = "";
		
		int number = rand.nextInt(5);
		
		switch(number) {
		
			case 0 :
				computer_move = "Pershult";
				
			case 1 :
				computer_move = "Klyket";
				
			case 2 :
				computer_move = "Tjusig";
				
			case 3 :
				computer_move = "Skadis";
				
			case 4 : 
				computer_move = "Hovolm";
		}
		
		return computer_move;
	}
	
	// 4th method - get player's move
	public static String player(Scanner grab) {
		
		System.out.println("Choose your move from 'p' for Pershult, 'k' for Klyket, 't' for Tjusig, 's' for Skadis, 'h' for Hovolm. ");
		
		String player_move = grab.nextLine().toLowerCase();
		
		while (!player_move.equals("p") && !player_move.equals("k") && !player_move.equals("t") && !player_move.equals("s") && !player_move.equals("h")) {
			
			System.out.println("Enter error! Choose your move from 'p' for Pershult, 'k' for Klyket, 't' for Tjusig, 's' for Skadis, 'h' for Hovolm. ");
			
			player_move = grab.nextLine().toLowerCase();
		}
		
		if (player_move.equals("p")) {
			player_move = "Pershult";
		} else if (player_move.equals("k")) {
			player_move = "Klyket";
		} else if (player_move.equals("t")) {
			player_move = "Tjusig";
		} else if (player_move.equals("s")) {
			player_move = "Skadis";
		} else if (player_move.equals("h")) {
			player_move = "Hovolm";
		}
		
		return player_move;
	}
	
	// 5th method - decide the winner
	public static boolean winner(String computer_move, String player_move) {
		
		if (player_move.equals("Pershult") && (computer_move.equals("Klyket") || computer_move.equals("Skadis"))) {
			return true;
		} else if (player_move.equals("Klyket") && (computer_move.equals("Tjusig") || computer_move.equals("Hovolm"))) {
			return true;
		} else if (player_move.equals("Tjusig") && (computer_move.equals("Pershult") || computer_move.equals("Skadis"))) {
			return true;
		} else if (player_move.equals("Skadis") && (computer_move.equals("Klyket") || computer_move.equals("Hovolm"))) {
			return true;
		} else if (player_move.equals("Hovolm") && (computer_move.equals("Pershult") || computer_move.equals("Tjusig"))) {
			return true;
		}
		
		return false;
	}
	
}