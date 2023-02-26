package Interview;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacci(7);
    }
    public static void printFibonacci(int count){

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <=count ; i++) {

            a=b;
            b=c;
            c=a+b;

            System.out.print(a + ", ");
        }
    }
}
/*
A Interview.Fibonacci sequence is one in which each number is the sum of the two previous numbers.
 In this example, the sequence begins with 0 and 1.
 The following example code shows how to use a for loop to print a Interview.Fibonacci sequence:
 */