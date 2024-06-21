import java.util.Scanner;

public class MatrixColumnSum {
    public static double[][] readMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        
        return matrix;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] matrix = readMatrix();
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf("Sum of the elements at column %d is %.2f\n", i, sumColumn(matrix, i));
        }
    }
}
