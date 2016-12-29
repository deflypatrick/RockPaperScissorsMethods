import java.util.Scanner;
import java.util.Random;
public class RPSMethods {
	/** 
	 * Displays (prints an opening message for the Rock-Paper-Scissors Game
	 */

	public static void displayOpeningMessage(){
			
		System.out.println("This program will play a game of Rock-Paper-Scissors");
		System.out.println("For this program, Scissors = 1 ; Rock = 2 ; Paper = 3");
			
			
		}

	/**
	* getUserMove will prompt the user for a move. A valid move is
	* between 0 and 2. Any number less than 0 and bigger than 2 should
	* be rejected. Any input that is not a number should also be rejected.
	* This function should only return when a valid number is entered.
	* @param in Scanner used for reading input from keyboard
	* @return
	*/
	
	public static int getUserMove(Scanner rnd){
		int getUserMove;
		boolean number;
	
		//waiting user input and only accepts user input between 0-2 and rejects other user input
		do{
			System.out.println("Enter a number between 1 and 3");
			getUserMove = rnd.nextInt();
		//if user is between 0-2, then number = true
		if(getUserMove >= 1 && getUserMove <= 3){
			number = true;
			break;	
		}
		//if not, numbers over 3 or under 0 will be error, as well other keyboard keys especially letters and symbols will be denied 
		else{
			System.out.println("The output is an error. Please enter another number. ");
			number = false;
			rnd.next();
		}
	}
	// waiting till response is a number between 0-2
	while(!(number));
	return getUserMove;
	}
	
	
	
	/**
	 * Generates a Random number between 0 and 2 
	 * @return an integer between 0 and 2
	 * 
	 * @param args
	 */
	
	public static int getCPUMove(Random rps){
		//generates a number between 0-2 
		int getCPUMove = 1 + rps.nextInt(3
				);
		
		//sends back getCPUMove to the main
		return getCPUMove;
		
	}
	
	/**
	 * Given a user and cpu move, this function determines who wins
	 * a game of Rock-Paper-Scissors.
	 * @param user user's current move
	 * @param cpu computer's current move
	 * 
	 * @param args
	 */
	public static void determineWinner(int getUserMove, int getCPUMove){
		
		//defines the value of scissors, rock, and paper
		int scissors = 1, rock = 2, paper = 3; 
		
		//if user = rock, win = scissors, loss = paper , draw = rock
		if(getUserMove == rock){
			if(getCPUMove == scissors){
				System.out.println("Rock beats scissors! You win! ");
			}
			else if (getCPUMove == paper){
				System.out.println("Paper beats rock. You lose. Try again! ");
			}
			else if (getCPUMove == rock){
				System.out.println("Rock can't beat rock. It's a draw. Try again! ");
			}
		}
		
		//if user = paper, win = rock, loss = scissors, draw = paper
		if(getUserMove == paper){
			if(getCPUMove == scissors){
				System.out.println("Scissors beats paper. You lose. Try again! ");
			}
			else if(getCPUMove == rock){
				System.out.println("Paper beats rock. You win! ");
			}
			else if(getCPUMove == paper){
				System.out.println("Paper can't beat paper. It's a draw. Try again! ");
			}
		}
		
		//if user = scissors, win = rock, loss = paper, draw = scissors
		if(getUserMove == scissors){
			if(getCPUMove == paper){
				System.out.println("Scissors beats paper. You win! ");
			}
			if(getCPUMove == rock){
				System.out.println("Rock beats scissors. You lose. Try again! ");
			}
			if(getCPUMove == scissors){
				System.out.println("Scissors can't beat scissors. It's a draw. Try again! ");
			}
		}
		
	}
	
	public static void main(String args[]){
	Scanner rnd = new Scanner(System.in);	
	Random ram = new Random();
	int userMove, cpuMove;	
	
	
	displayOpeningMessage();
	userMove = getUserMove(rnd);
	cpuMove = getCPUMove(ram);
	determineWinner(userMove,cpuMove);
	
	
	
	}
	
}
