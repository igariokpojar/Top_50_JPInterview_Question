public class FactorialOfInteger {

    public static void main(String[] args) {

        System.out.println(factorial(5)); // 1*5=5; 2*5=10; 3*10=30; 4*30=120 -> Viola
    }

    //The following example code shows how to use recursion to find the factorial of an integer:
    public static long factorial(long num){
        if (num==1)return 1;
        else
            return (num*factorial(num-1));
    }
}
/*
    The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:

               F(n) = F(1)*F(2)...F(n-1)*F(n)
     */

