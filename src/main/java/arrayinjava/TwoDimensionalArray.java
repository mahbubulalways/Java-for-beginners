package arrayinjava;

import java.util.Scanner;

public class TwoDimensionalArray {
   public static void main(String[] args) {
    int row, col, element;
    
    // * TAKES ROW NUMBERS
    System.out.print("Enter the number of row : ");
    Scanner numberOfRow = new Scanner(System.in);
    row= numberOfRow.nextInt();

    // * TAKES COL NUMBERS
    System.out.print("Enter the number of col : ");
    Scanner numberOfCol = new Scanner(System.in);
    col= numberOfCol.nextInt();

    // * TAKES ELEMENTS
    System.out.println("Enter the element");
    Scanner getElement = new Scanner(System.in);

    // * INITIALIZE ARRAY
    int[][] arr = new int [row][col];

    // * MAKE AN ARRAY
    for(int i = 0 ; i < row; i++){
       for(int j = 0; j < col; j++){
        System.out.print("Element [" + i + "][" + j + "]: ");
        element= getElement.nextInt();
        arr[i][j] = element;
       }
    }

    // * PRINT THE ARRAY
    for(int i =0; i<row; i++){
        for(int j = 0; j<col; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }

   }

}
