package javaforbehinner;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num, fibo = 0;
        System.out.println("How many fibonacci number you want to see");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
         int first =0;
         int second = 1;
         System.out.println("Fibonacci = " + first);
         System.out.println("Fibonacci = " + second);
         for(int i = 3; i<=num; i++ ){
            fibo = first + second;
            if(num == i){
                System.out.println("Fibonacci = " + fibo);
            };
            first = second;
            second = fibo;
         }
    }
}
