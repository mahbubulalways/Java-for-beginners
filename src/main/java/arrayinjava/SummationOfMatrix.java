package arrayinjava;

import java.util.Scanner;

public class SummationOfMatrix {
  public static void main(String[] args) {
    int row, col;
    System.out.print("Enter the row number: ");
    Scanner rowNumber = new Scanner(System.in);
    row = rowNumber.nextInt();
    System.out.print("Enter the row number: ");
    Scanner colNumber = new Scanner(System.in);
    col = colNumber.nextInt();
    int[][] A = new int [row][col];
    int[][] B = new int [row][col];
    int [][] sum = new int [row][col];
    Scanner input= new Scanner(System.in);

    //* ENTER VALUE OF A MATRIX PART */
    System.out.println("Enter the A matrix element");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print("A[" + i + "][" + j + "]: ");
            A[i][j]=input.nextInt();
        }
    }

    //*  ENTER VALUE OF B MATRIX PART */ 
    System.out.println("Enter the B matrix element");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print("B[" + i + "][" + j + "]: ");
            B[i][j]=input.nextInt();
        }
    }


    System.out.println();
    //* PRINT A MATRIX PART */ 
    System.out.print("A = ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print( "\t " + A[i][j]);
        }
        System.out.println();
    }


    System.out.println();
    //* PRINT B MATRIX PART */ 
    System.out.print("B = ");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print( "\t "+ B[i][j] );
        }
        System.out.println();
    }


    System.out.println();
    //* SUMMATION OF MATRIX A + B */ 
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 3; j++){
            sum[i][j] = (B[i][j] + A[i][j]);
        }
    }

    System.out.println();
    //* SHOW THE SUMMATION  */ 
    System.out.print("SUM = ");
    for(int i=0; i<row; i++){
        for(int j =0; j<col; j++){
            System.out.print("\t " + sum[i][j]);
        }
        System.out.println();
    }
    System.out.println();
  }
}
