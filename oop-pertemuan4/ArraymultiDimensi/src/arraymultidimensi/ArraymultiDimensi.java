
package arraymultidimensi;

import java.util.Scanner;

/**
 *
 * @author Wihelmina Aprilia Guman
 * TGL: 12 April 2025
 */
public class ArraymultiDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][2];
        
        meja[0][0] = "Meja A";
        meja[0][1] = "Meja B";
        
        meja[1][0] = "Meja c";
        meja[1][1] = "Meja D";
        
        meja[2][0] = "Meja E";
        meja[2][1] = "Meja F";
        
        Scanner inp = new Scanner(System.in);
        for(int brs=0; brs<3; brs++){
            System.out.printf("baris ke-%d\n",brs);
            for(int k1m=0; k1m<2; k1m++){
                System.out.printf("Kolom ke-%d: ", k1m);
                meja[brs][k1m] = inp.nextLine();
            }
            
        }
        
    }
}
    

