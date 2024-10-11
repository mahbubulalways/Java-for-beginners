package arrayinjava;

import java.util.Scanner;

/**
 * DiagonalMatrix
 */
public class DiagonalMatrix {

    public static void main(String[] args) {
        int diagonal=0;
        int upper=0;
        int lower=0;
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        //* ASSIGN THE MATRIX */
        System.out.println("Enter the elements of matrix");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            System.out.print("matrix ["+i + "]["+j+ "]: ");
             int element = input.nextInt();
             matrix[i][j] = element;
            }
        }


        //* PRINT THE MATRIX */ 
        System.out.println();
        System.out.println("matrix = ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
             System.out.print("\t  " + matrix[i][j]);
            }
            System.out.println();
        }

        //* Diagonal upper lower triangle upper triangle*/ 
        System.out.println();

        //* i = row ; j = col */
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
              // * DIAGONAL
                if(i == j){
                    diagonal = diagonal + matrix[i][j];
                }

              // * UPPER TRIANGLE col index  > row index
                if(j > i){
                    upper = upper + matrix[i][j];
                }

              // * UPPER TRIANGLE row index > col index 
                if(i > j){
                    lower = lower + matrix[i][j];
                }

            }
        }
        

        System.out.println("Sum of diagonal matrix is = " + diagonal);
        System.out.println("Sum of upper triangle matrix is = " + upper);
        System.out.println("Sum of lower triangle matrix is = " + lower);
    }
    
}