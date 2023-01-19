import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Moldova","Romania","Alex","Alla");
        str.stream().filter(s -> s.contains("A"))
                .map(String::toLowerCase).sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");

        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,99);

        Integer stat =  list.stream().mapToInt((x) -> x).summaryStatistics().getMax();
        System.out.println(stat);

        System.out.println("-----------------------------------------------------------");

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
         numbers.stream() .map( i -> i*i).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------");

        // Count the empty strings
         List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
         long count = strList.stream() .filter(x -> x.isEmpty())
                 .count(); System.out.printf("List %s has %d empty strings %n", strList, count);

        System.out.println("---------------------------------------------------------------");

        // Count String with length more than 3
        long num = strList.stream() .filter(x -> x.length()> 3) .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

        System.out.println("------------------------------------------------------------------");

        // Remove all empty Strings from List
         List<String> filtered = strList.stream() .filter(x -> !x.isEmpty())
                 .collect(Collectors.toList());
         System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);

        System.out.println("-------------------------------------------------------------------");

        //Get count, min, max, sum, and average for numbers
         List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
         IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x)
                 .summaryStatistics(); System.out.println("Highest prime number in List : " + stats.getMax());
                 System.out.println("Lowest prime number in List : " + stats.getMin());
                 System.out.println("Sum of all prime numbers : " + stats.getSum());
                 System.out.println("Average of all prime numbers : " + stats.getAverage());




    }
}
