package matrixClass;

public class Matrix {
    private float[][] array;
    private byte numOfRows;
    private byte numOfColumns;


    public void addition(float[][] matrix) {
        if(matrix[0].length == array[0].length && matrix.length == array.length) {
            for(int i = 0; i < matrix.length; ++i) {
                for(int j = 0; j < matrix[0].length; ++j) {
                    array[i][j] += matrix[i][j];
                }
            }
        } else {
            System.out.println("Size of your matrix unequal to the previous");
        }
    }

    public float[][] getMatrix() {
        return array;
    }
    public void setNumOfRows(byte numOfRows) {
        this.numOfRows = numOfRows;
    }
    public byte getNumOfRows() {
        return numOfRows;
    }
    public void setNumOfColumns(byte numOfColumns) {
        this.numOfColumns = numOfColumns;
    }
    public byte getNumOfColumns() {
        return numOfColumns;
    }
}
