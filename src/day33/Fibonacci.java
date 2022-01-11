package day33;

public class Fibonacci {
    public static void main(String[] args) {
        /*
         In the Fibonacci series, the next number is the sum of previous two numbers.
          For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc...
          The first two numbers of the Fibonacci series are 0 and 1.
          (Counting starts with an index 0, so the 0th number is 0, 1st number is 1,
          etc)

You are given a number num, print n-th Fibonacci Number
         */
        int n=8;
        int num0=0;
        int num1= 1;
        int sum=0;

        for (int i = 2; i <n; i++) {
            sum = num0+num1;
            num0=num1;
            num1=sum;
        }
        System.out.println(sum);
    }
}
