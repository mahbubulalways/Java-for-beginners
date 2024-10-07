package javaforbehinner;

import java.util.Scanner;

public class PrimeNumberMtoN {
 public static void main(String[] args) {
    int start, end;
    int count;
    int sum =0;
    System.out.println("Enter the starting number");
    Scanner  starting = new Scanner(System.in);
    start = starting.nextInt();
    System.out.println("Enter the Ending number");
    Scanner  ending = new Scanner(System.in);
    end = ending.nextInt();
    for(int i = start; i <= end; i++){
        count = 0;
           for(int j = 2; j <= i-1; j++){
            if( i % j == 0 ){
                count++;
                break;
            }
           }

        if(count == 0 ){
        System.out.println(i);
        count = 0;
        sum++;
        }else{
            // System.out.println("NOT PRIME");
        }
    }
    System.out.println("The Number of Prime numbers = " + sum);
 }
}