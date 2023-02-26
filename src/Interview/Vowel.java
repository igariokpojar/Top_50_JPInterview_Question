package Interview;

public class Vowel {

    public static void main(String[] args) {

        System.out.println(stringContainsVowel("Alla")); // true
        System.out.println(stringContainsVowel("TW")); // false

    }
    public static boolean stringContainsVowel(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
