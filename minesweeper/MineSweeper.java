package MineSweeper;

import java.lang.management.ThreadInfo;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MineSweeper {
    int row;
    int column;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    void test() {
        int count = 0;
        String[][] matrix = new String[this.row][this.column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int random = (int) (Math.random() * 2);
                matrix[i][j] = " - ";
                if (random == 1) {
                    if (count == this.row * this.column / 4)
                        continue;
                    matrix[i][j] = " * ";
                    count++;
                }
            }
        }
        String[][] userMatrix = new String[this.row][this.column];
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix[i].length; j++) {
                userMatrix[i][j] = " - ";
            }
        }
        System.out.println("Mayın Haritası: ");
        display2D(matrix);
        System.out.println("Oyun Başladı: ");
        display2D(userMatrix);
        findNumbers(matrix, userMatrix);

    }

    void run() {
        test();
    }

    void display2D(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void findNumbers(String[][] matrix, String[][] userMatrix) {
        Scanner scan = new Scanner(System.in);

        do {
            do {
                System.out.print("Enter row: ");
                int row = scan.nextInt();
                System.out.print("Enter column: ");
                int column = scan.nextInt();
                if (row >= this.row || column >= this.column || row < 0 || column < 0) {
                    System.out.println("Geçerli bir değer giriniz: ");
                }
            } while (row >= this.row || column >= this.column || row < 0 || column < 0);

            for (int i = 0; i < userMatrix.length; i++) {
                for (int j = 0; j < userMatrix[i].length; j++) {
                    if (matrix[i - 3][j].equals(" * ")) {
                        System.out.println("ff");
                    }
                }
            }
            int count = 0;

        } while (true);
    }

}
