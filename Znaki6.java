public class Znaki6 {
    public static void main(String[] args) {
        String word = "alfabet";
        char letter = 'a';
        int howManyTimes = 0;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                howManyTimes++;
            }
        }
        System.out.println(howManyTimes);
    }
}
