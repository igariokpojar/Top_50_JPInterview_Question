package Interview;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        System.out.print(removeWhiteSpaces(" Alex is going in vacation "));

        System.out.println();

        String str = " Java  programming automation";

        String striped = str.strip();

        System.out.print("After execute strip(): "+striped);
    }
    public static String removeWhiteSpaces(String str){

        StringBuilder out = new StringBuilder();

        char[] arr = str.toCharArray();

        for (char each:arr){
            if (!Character.isWhitespace(each))
                out.append(each);
        }
        return out.toString();
    }
}
