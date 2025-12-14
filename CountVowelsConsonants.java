public class CountVowelsConsonants {

  public static void count(String s) {
    s = s.toLowerCase();

    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
  }

  public static void main(String[] args) {
    String s = "hello world";
    count(s);
  }
}
