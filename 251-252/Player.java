/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  public Player() {
    int points = 0;
    System.out.println("Enter player name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.println("Welcome to the game, " + name + "!");
  }

  public Player(String inputname) {
    String name = inputname;
    int points = 0;
    System.out.println("Hello there, and welcome to the game, " + name);
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}