import java.util.Scanner;

public class Player {
  public String name;
  int points1; // Points for player 1
  int points2; // Points for player 2

  public Player() {
    points1 = 0;
    points2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter player name: ");
    name = sc.nextLine();
    System.out.println("Welcome to the game, " + name + "!");
  }

  public Player(String inputName) {
    name = inputName;
    points1 = 0;
    points2 = 0;
    System.out.println("Hello there, and welcome to the game, " + name);
  }

  public String getName() {
    return name;
  }

  public int getPoints(int playerNumber) {
    return (playerNumber == 1) ? points1 : points2;
  }

  public void addToPoints(int playerNumber, int value) {
    if (playerNumber == 1) {
      points1 += value;
    } else {
      points2 += value;
    }
  }
}
