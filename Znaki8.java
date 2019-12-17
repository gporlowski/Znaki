public class Znaki8 {
  public static void main(String[] args) {
    String charString = "aabbbccbb";
    String longestSameCharString = "";
    for (int i = 0; i < charString.length(); i++) {
      int j = i;
      while(j < charString.length() && charString.charAt(j) == charString.charAt(i)) {
        j++;
      }
      if(j - i > longestSameCharString.length()) {
        longestSameCharString = charString.substring(i, j);
      }
    }
    System.out.println("W teście \"" + charString + "\" najdłuższym ciągiem wystąpień jednej litery jest: " + longestSameCharString);
  }
}
