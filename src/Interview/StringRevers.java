package Interview;

public class StringRevers {

    public static void main(String[] args) {

        String str = "Alla";
        System.out.println(reverse(str));

        String str1 = "123";
        System.out.println(reverse(str1));


    }
    public static String reverse(String str) {
        if (str.isEmpty()) throw new IllegalArgumentException("String can not be empty");

        String revers = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.charAt(i);

        }
        return revers;
    }


//    public static String reverse(String in) {
//        if (in == null)
//            throw new IllegalArgumentException("Null is not valid input");
//
//        StringBuilder out = new StringBuilder();
//
//        char[] chars = in.toCharArray();
//
//        for (int i = chars.length - 1; i >= 0; i--)
//            out.append(chars[i]);
//
//        return out.toString();
//    }
}
