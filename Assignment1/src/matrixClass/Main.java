package matrixClass;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        float[][] array = {{1, 2, 3}, {2, 3, 4}, {1, 2, 5}};
        matrix.setMatrix(array);
        matrix.printMatrix();
        Matrix secondMatrix = new Matrix();
        secondMatrix.setMatrix(3,3);
//        secondMatrix.printMatrix();
        secondMatrix.addition(matrix.getMatrix());
        secondMatrix.printMatrix();
    }
}