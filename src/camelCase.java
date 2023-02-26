public class camelCase {

    public static String camelCase(String line){

        String[] ar = line.split("");
        StringBuilder sb = new StringBuilder();
        int numAlphabetic = 0;
        for (String str : ar) {
            if (Character.isAlphabetic(str.charAt(0))) {
                if (numAlphabetic % 2 == 0) {
                    sb.append(str.toUpperCase());
                } else {
                    sb.append(str.toLowerCase());
                }
                numAlphabetic++;
            } else {
                sb.append(str);
            }
        }
        return sb.toString();

    }
}
