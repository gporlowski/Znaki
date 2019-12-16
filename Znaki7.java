public class Znaki7 {
    public static void main(String[] args) {
        String word = "kajak";
        boolean result = true;
        int wordLength = word.length() - 1;
        for (int i = 0; i < word.length() / 2 + 1; i++) {
            if (word.charAt(i) != word.charAt(wordLength)){
                result = false;
            }
            wordLength--;
        }
        if (result) {
            System.out.println("Słowo \"" + word + "\" jest palindromem.");
        } else {
            System.out.println("Słowo \"" + word + "\" nie jest palindromem.");
        }
    }
}
