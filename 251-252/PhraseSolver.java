/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver
{
  /* your code here - attributes */
  Player player1;
  Player player2;
  Board board;
  boolean solved;
  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player("Ryan");
    board = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s)  */

  public void play()
  {
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    while (!solved) {
      // Print the current solved phrase
      System.out.println("Current Solved Phrase: " + board.getSolvedPhrase());

      Player currentPlayerObject = (currentPlayer == 1) ? player1 : player2;
      String currentPlayerName = currentPlayerObject.getName();

      System.out.print(currentPlayerName + ", enter your guess: ");
      String guess = input.nextLine();

      if (guess.length() == 1) {
        boolean foundLetter = board.guessLetter(guess);
        if (foundLetter) {
          int randomPoints = (int) (Math.random() * 5) + 1; // Generate a random point value
          currentPlayerObject.addToPoints(currentPlayer, randomPoints); // Award points for guessing a correct letter
          System.out.println(currentPlayerName + " guessed a correct letter and earned " + randomPoints + " points.");
          System.out.println("Player 1 points: " + player1.getPoints(1));
          System.out.println("Player 2 points: " + player2.getPoints(2));
        }
      }

      if (board.isSolved(board.getSolvedPhrase())) {
        System.out.println(currentPlayerName + " solved the phrase!");
        solved = true;
        break;
      }

      System.out.println("Incorrect guess. Switching players.");
      currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

  }

}
