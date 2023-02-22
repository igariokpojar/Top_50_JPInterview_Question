import java.util.*;

public class RomanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("CCXLVIII"));

    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = map.get(s.charAt(s.length() - 1));
        // Loop for each character from right to left
        for (int i = s.length() - 2; i >= 0; i--) {
       // if the value 1000>=500 then nums+
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                num += map.get(s.charAt(i));
            } else {
                num -= map.get(s.charAt(i));
            }
        }
        return num;
    }
}



