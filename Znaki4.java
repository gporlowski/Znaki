public class Znaki4 {
    public static void main(String[] args) {
        String word = "alfabet";
        char biggestChar = word.charAt(0);
        for(int i = 1; i < word.length(); i++) {
            if (word.charAt(i) > biggestChar) {
                biggestChar = word.charAt(i);
            }
        }
        System.out.println("Największa litera w teście to: " + biggestChar);
    }
}
