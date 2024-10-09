package arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoOne {
 public static void main(String[] args) {
     int size, element;
     int sum = 0;
     double average=0;
    System.out.println("How many element you want to store");
    Scanner arrayInput = new Scanner(System.in);
    size = arrayInput.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter " + size+ " elements");
    Scanner elements = new Scanner(System.in);
    for(int i = 0 ; i < arr.length ; i++){
        System.out.println("Enter " + i + "th" + " elements");
        element = elements.nextInt();
        arr[i] =element ;
        sum = sum + element;
        average = (double) sum / arr.length;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Total summation of array is " + sum );
    System.out.println("Total Average of array is " + average );
 }
}
