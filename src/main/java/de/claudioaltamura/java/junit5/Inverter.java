package de.claudioaltamura.java.junit5;

public class Inverter {

  private String[] correctWords;

  public Inverter(String... correctWords) {
    this.correctWords = correctWords;
  }

  public boolean isInverted(String invertedWord) {
    for (String word : correctWords) {
      String tmp = new StringBuilder(invertedWord).reverse().toString();
      if (word.equals(tmp)) {
        return true;
      }
    }
    return false;
  }

  public int badMethod(int i) {
    throw new RuntimeException("bad method");
  }
}
