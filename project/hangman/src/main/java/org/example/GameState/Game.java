package org.example.GameState;

import org.example.Entities.Tasks;

import java.util.Timer;

public class Game {
  private static Integer tryOut = 1;
  private static Integer timer = 500; //seconds to minutes
  static Tasks task = new Tasks();
  static Timer timerCounter = new Timer();
  private static boolean hasStarted;

  public void main(String[] args) {
    if(hasStarted) {
      try {
        timerCounter.scheduleAtFixedRate(task, 0, 60000);
      } catch (Exception exception) {
        System.out.println(exception.getMessage());
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
    hasStarted = hasStarted;
  }
}
