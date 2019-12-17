public class Znaki9 {
  public static void main(String[] args) {
    String word1 = "alfabet";
    String word2 = "alfa";
    if (word1.contains(word2)) {
      System.out.println("Słowo \"" + word2 + "\" zawiera się w słowie \"" + word1 + "\".");
    } else {
      System.out.println("Słowo \"" + word2 + "\" nie zawiera się w słowie \"" + word1 + "\".");
    }
  }
}
