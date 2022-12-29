package matrixClass;

import java.util.Scanner;

public class Matrix {
    private float[][] matrix;
    private int numOfRows;
    private int numOfColumns;

    public void setMatrix(int numOfRows, int numOfColumns) {
        Scanner cout = new Scanner(System.in);
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        matrix = new float[numOfRows][numOfColumns];
        for(int i = 0; i < numOfRows; ++i) {
            for(int j = 0; j < numOfColumns; ++j) {
                matrix[i][j] = cout.nextFloat();
            }
        }
        System.out.println("You have successfully entered the matrix" + '\n');
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = new float[matrix.length][matrix[0].length];
        numOfRows = matrix.length;
        numOfColumns = matrix[0].length;
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[0].length; ++j) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public void addition(float[][] matrix) {
        if(this.matrix[0].length == matrix[0].length && this.matrix.length == matrix.length) {
            for(int i = 0; i < matrix.length; ++i) {
                for(int j = 0; j < matrix[0].length; ++j) {
                    this.matrix[i][j] += matrix[i][j];
                }
            }
        } else {
            System.out.println("Size of your matrix unequal to the previous" + '\n');
        }
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void printMatrix() {
        System.out.println("===========================");
        for(int i = 0; i < numOfRows; ++i) {
            for (int j = 0; j < numOfColumns; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public int getNumOfRows() {
        return numOfRows;
    }
    public int getNumOfColumns() {
        return numOfColumns;
    }
}

