package org.example.GameState;

import org.example.Entities.Tasks;
import org.example.Entities.Words;

import java.util.Scanner;
import java.util.Timer;

public class Game {
  private static Integer tryOut = 1;
  private static Integer timer = 500; //seconds to minutes
  static Tasks task = new Tasks(tryOut, timer);
  static Timer timerCounter = new Timer();
  private static boolean hasStarted;
  private Words words = new Words();
  private String secretWord = "_".repeat(words.getWord().length());
  public void main() {
    Scanner scanner = new Scanner(System.in);
    if(hasStarted) {
      while(!words.getWord().equals(secretWord)) {
        System.out.println("Guess a word: ");
        String letter = scanner.nextLine();
        //looping for every secret words
        for(int i = 0; i < secretWord.length(); i++) {
          if(words.getWord().charAt(i) == letter.charAt(0)) {
            secretWord = secretWord.substring(0, i) + letter + secretWord.substring(i, 1);
          }
        }
        System.out.println(secretWord);
        if(secretWord.contains(letter)) {
          System.out.println("You guessed it right!");
        } else {
          System.out.println("You guessed it wrong!");
        }
      }
    } else {
      System.out.println("Game has not started yet!");
    }
  }
  public Game() {
  }

  public Integer getTryOut() {
    return tryOut;
  }

  public void setTryOut(Integer tryOut) {
    tryOut = tryOut;
  }
  public static void initiateGame () {
    timer = 500;
    tryOut = 1;
  }
  public void setHasStarted(boolean hasStarted) {
    this.hasStarted = hasStarted;
  }
}
