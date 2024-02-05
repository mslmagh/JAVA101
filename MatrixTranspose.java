import java.util.Random;

public class MatrixTranspose {
    public static void main(String[] args) {
        Random random = new Random();

        int row = 3;
        int column = 4;

        int[][] matris = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matris[i][j] = random.nextInt(10) + 1;
            }
        }

        int[][] transpozMatris = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matris:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
