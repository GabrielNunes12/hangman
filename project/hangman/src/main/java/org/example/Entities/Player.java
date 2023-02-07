package org.example.Entities;

import java.util.Objects;

public class Player {
  private String name;
  private Integer tryOut = 4;
  private boolean finished = false;

  public Player(String name, Integer tryOut, boolean finished) {
    this.name = name;
    this.tryOut = tryOut;
    this.finished = finished;
  }

  public Player() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getTryOut() {
    return tryOut;
  }

  public void setTryOut(Integer tryOut) {
    this.tryOut = tryOut;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Player)) return false;
    Player player = (Player) o;
    return isFinished() == player.isFinished() && Objects.equals(getName(), player.getName()) && Objects.equals(getTryOut(), player.getTryOut());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getTryOut(), isFinished());
  }
}
