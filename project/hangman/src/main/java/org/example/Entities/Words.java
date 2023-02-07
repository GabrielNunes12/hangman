package org.example.Entities;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Words {
  Random geradorDePalavras = new Random();
  private List<String> words = Arrays.asList("Abacate", "Soneca", "Lazy");
  private int randomIndex = geradorDePalavras.nextInt(words.size());

  private String word = words.get(randomIndex);

  public Words() {
  }

  public List<String> getWords() {
    return words;
  }

  public int getRandomIndex() {
    return randomIndex;
  }
  public String getWord() {
    return this.word;
  }
}
