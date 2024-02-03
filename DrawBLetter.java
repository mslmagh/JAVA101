import javax.swing.event.ListSelectionEvent;

public class DrawBLetter {
    public static void main(String[] args) {
        String[][] letter = new String[13][8];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                letter[i][j] = "  ";
                if (i == 0 & j >= 1 && j <= 4) {
                    letter[i][j] = " * ";
                } 
                if (i == 6 & j >= 1 && j <= 4) {
                    letter[i][j] = " * ";
                } 
                 if (i == 12 & j >= 1 && j <= 4) {
                    letter[i][j] = " * ";
                } 
                 if (i <= 11 & i >= 1) {
                    letter[i][0] = " * ";
                } 
                 if (j == 7 & i >= 2 && i <= 4) {
                    letter[i][j] = " * ";
                } 
                 if (j == 7 & i >= 8 && i <= 10) {
                    letter[i][j] = " * ";
                }
                letter[1][6] = " * ";
                letter[5][6] = " * ";
                letter[7][6] = " * ";
                letter[11][6] = " * ";

            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
