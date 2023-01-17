import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2); // false
        /*
        The output of the given statement is false because the + operator has a higher precedence than the == operator.
         So the given expression is evaluated to “s1 == s2 is:abc” == “abc”, which is false.
         */
        System.out.println("--------------------------------------------------------------");

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(s3.substring(start, end)); // ourn

        System.out.println("--------------------------------------------------------------");

        HashSet shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size()); // 100

        System.out.println("---------------------------------------------------------------");
        String x = "abc";
        String y = "abc";
        x.concat(y);

        System.out.print(x); // abc

        System.out.println("-----------------------------------------------------------");

       // public class String Programs {

           // static void main(String[10] args) {
            //    String s = "abc"
             //   System.out.println(s);
         //   }
      //  }
        /*
        The class name can’t have spaces.
        The main method is not public, so it won’t run.
        The main method argument shouldn’t specify the size.
        The semicolon is missing in the string definition
         */

    }
}


