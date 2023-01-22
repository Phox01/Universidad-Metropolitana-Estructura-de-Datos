/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovector;

/**
 *
 * @author User
 */
public class Funcion {

    public int searchMaxinVector(int[] vector) {
        int maxInt = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maxInt) {
                maxInt = vector[i];
            }
        }
        return (maxInt);
    }

    public int[][] sumMatrix(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                matrix[i][j] = mat1[i][j] + mat2[i][j];
            }

        }

        return (matrix);

    }

    public int[][] productMatrix(int[][] mat1, int[][] mat2) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                for (int k = 0; k < mat1[i].length; k++) {
                    matrix[i][j] += mat1[i][k] * mat2[k][j]; //+ mat1[i][j + 1] * mat2[i + 1][j];

                }
            }

        }

        return (matrix);
    }

}
