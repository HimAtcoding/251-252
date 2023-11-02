/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  public Board() {
    solvedPhrase = "";
    phrase = loadPhrase();
    currentLetterValue = setLetterValue();
    System.out.println("Phrase: " + phrase);
  }
  /* your code here - accessor(s) */
  public String getSolvedPhrase() {
    //incomplete
  }
  public int getLetterValue() {
    return currentLetterValue;
  }
  /* your code here - mutator(s)  */
  public boolean solvePhrase(String phrase) {
    //incomplete
  }

  /* ---------- provided code, do not modify ---------- */
  public int setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
    return currentLetterValue;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  public String loadPhrase()
  {
    String tempPhrase = "";

    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  

    return tempPhrase;
  }  
  //pre condition: guess is equal or isnt equal to the hidden phrase
  //post condition: return true/false, and set the hidden word (in underscores) to be the same thing, but with letter(s) replaced at certain indexes (if present in the word), else the original underscore filled word will be outputted
  public boolean guessLetter(String guess)
  {
    //instantiates essential instance variables to say that the finding of a new letter is false
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    // for loop that iterates through the hidden phrase, character by character
    for (int i = 0; i < phrase.length(); i++)
    {
    // if statement that checks if the guessed letter is equal to a specific letter in the hidden phrase (this checks for all occurences)
      if (phrase.substring(i, i + 1).equals(guess))
      {
        // the hidden phrase which is initially filled with underscores will replace some of them with the occurance of the guessed letter at the right places
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    //return true or false based on if you found a letter or not
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 
