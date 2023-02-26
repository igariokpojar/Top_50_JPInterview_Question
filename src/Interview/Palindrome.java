package Interview;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Alex")); //false
        System.out.println(isPalindrome("Alla")); // true
        System.out.println(checkPalindrome("Ava")); // true

    }
    public static boolean isPalindrome(String str){

        String revers = "";
        str = str.toLowerCase();
        for (int i = str.length()-1; i >=0 ; i--) {
            revers+=str.charAt(i);
        }
        if (revers.equals(str)){
            return true;
        }
        return false;
    }

    public static boolean checkPalindrome(String input) {
        boolean result = true;
        int length = input.length();
        input=input.toLowerCase();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }

}
/*
A palindrome string is the same string backwards or forwards.
To check for a palindrome, you can reverse the input string and check if the result
 is equal to the input. The following example code shows how to use
 the String charAt(int index) method to check for palindrome strings:
 */