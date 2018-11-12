package guessGame;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {

		int guess = 0;
		
		String playAgain = "";
		Scanner scan = new Scanner(System.in);


		do {
			int number = (int)(Math.random() * 100 + 1);
			int attempts = 0;
			System.out.println("Guess a number between 1 and 100: ");

			while(guess != number) {


				guess = scan.nextInt();
				if(guess < number) {
					System.out.println("Your guess was too low, try again.");
					attempts++;
				}
				else if(guess > number) {
					System.out.println("Your guess was too high, try again.");
					attempts++;
				}
				else {
					attempts++;
					System.out.println("You guessed right, took you " + attempts + " turns!");
				}
			}	System.out.println("Play again? y/n");
			playAgain = scan.next();
		} while(playAgain.equalsIgnoreCase("y"));
			System.out.println("Thanks for playing.");
	}


}
