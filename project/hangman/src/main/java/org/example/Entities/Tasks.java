package org.example.Entities;

import org.example.GameState.Game;

import java.util.TimerTask;

public class Tasks extends TimerTask {
  private Integer timer;
  private Integer tryOut;

  public Tasks() {
  }

  public void run() {
    timer --;
    if(timer < 0) {
      cancel();
      this.tryOut--;
      Game.initiateGame();
    }
  }
}
