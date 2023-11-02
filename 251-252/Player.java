/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  public String name = "";
  int points = 0;
  /* your code here - constructor(s) */ 
  public Player() {
    int points = 0;
    System.out.println("Enter player name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.println("Welcome to the game, " + name + "!");
  }

  public Player(String inputName) {
    String name = inputname;
    int points = 0;
    System.out.println("Hello there, and welcome to the game, " + name);
  }

  /* your code here - accessor(s) */ 
  public String getName() {
    return name;
  }

  public int getPoints() {
    return points;
  }
  /* your code here - mutator(s) */ 
  public void setName(String inputName) {
    //incomplete
  }

  public void addToPoints(int value) {
    //incomplete
  }
}
