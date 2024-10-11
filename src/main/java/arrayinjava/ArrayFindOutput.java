package arrayinjava;

import java.util.Scanner;

/**
 * ArrayFindOutput
 */
public class ArrayFindOutput {

    public static void main(String[] args) {
        int count=0;
        int  row;
        System.out.println("Enter the row number");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        int[][] arr = new int [row][];
       
        //* INCREASE COL NUMBER BY LOOPING */ 
        for(int i =0;  i< arr.length; i++){
            arr[i]= new int[i+1];
        }

        //* INSERT ELEMENT IN AN ARRAY */ 
        for(int i = 0;  i < arr.length; i++){
          for(int j = 0;  j < i+1; j++){
            arr[i][j] = count ;
            count++;
          }
        }

        // * PRINT THE ARRAY
        System.out.println("Array =");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print( "\t" + arr[i][j]);
            }
            System.out.println();
        }
    }
}