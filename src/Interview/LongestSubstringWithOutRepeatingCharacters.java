package Interview;

import java.util.*;

public class LongestSubstringWithOutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("I love Java"));
        System.out.println(LengthOfLongestSubstring("Alexandru Cel Bun"));

    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int i=0, j=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static int LengthOfLongestSubstring(String str){

        int a = 0;
        int b = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (b<str.length()){
            if (!set.contains(str.charAt(b))){
                set.add(str.charAt(b));
                b++;
                max = Math.max(set.size(),max);
            }else {
             set.remove(str.charAt(a));
             a++;
            }
        }
          return max;
    }
}
