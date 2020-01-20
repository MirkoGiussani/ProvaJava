package matrix;

/**
 *
 * @author giussani.mirko
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(new File("C:\\Users\\giussani.mirko\\Desktop\\matrix.txt"));
        // pre-read in the number of rows/columns
        int righe = 0;
        int colonne = 1;
        ++righe;
        
        String riga = input.nextLine();
        System.out.println("la matrice ha " + righe + " righe e " + colonne + " colonne");
        int[][] a = new int[righe][colonne];


        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < 0; j++) {
                if (input.hasNextInt()) {
                    a[i][j] = input.;
                }
            }
        }

        for (int i = righe - 1; i >= 0; i--) {
            for (int j = colonne - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

}
