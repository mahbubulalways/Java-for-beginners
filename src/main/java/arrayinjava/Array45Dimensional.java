package arrayinjava;

import java.util.Scanner;

public class Array45Dimensional {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        Scanner input = new Scanner(System.in);
         int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]= count;
                count=count+2;          
         }
        }

        // * PRINT 
        System.out.println("Array =");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print( "\t"+arr[i][j]);
            }
            System.out.println();
        }
    }
}
