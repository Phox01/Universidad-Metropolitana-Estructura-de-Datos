package ejerciciovector;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjercicioVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the option: ");
        int number = sc.nextInt();
        if (number == 1) {
            int[] vector = new int[10];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = i;

            }
            Funcion func = new Funcion();
            System.out.println(func.searchMaxinVector(vector));

        }
        if (number == 2) {
            int[][] mat1 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(+mat1[i][j] + " ");

                }
                System.out.println("");
            }
            int[][] mat2 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 5}};
            System.out.println("that was the first matrix");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2[i].length; j++) {
                    System.out.print(+mat2[i][j] + " ");

                }
                System.out.println("");
            }
            System.out.println("that was the second matrix");

            Funcion func = new Funcion();
            int[][] result = func.sumMatrix(mat1, mat2);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(+result[i][j] + " ");

                }
                System.out.println("");

            }
        }

        if (number == 3) {
            int[][] mat1 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(+mat1[i][j] + " ");

                }
                System.out.println("");
            }
            int[][] mat2 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 5}};
            System.out.println("that was the first matrix");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2[i].length; j++) {
                    System.out.print(+mat2[i][j] + " ");

                }
                System.out.println("");
            }
            System.out.println("that was the second matrix");

            Funcion func = new Funcion();
            int[][] result = func.productMatrix(mat1, mat2);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(+result[i][j] + " ");

                }
                System.out.println("");
            }

        }

    }
    
}
