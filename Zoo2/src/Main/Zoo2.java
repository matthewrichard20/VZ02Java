package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lathifah Nurrahmah
 */

import java.util.Scanner;
import Zoo.Zoo;
import Driver.Driver;
import java.io.IOException;

/**Zoo2
 *
 */
public class Zoo2 {
    
    /**Class main
     * kelas utama yang menjalankan program
     * @param args
     * -
     * @throws IOException
     * -
     */
    public static void main(String[] args) throws IOException {
        Driver driver = new Driver();
        Zoo zoo = new Zoo();
        Scanner reader = new Scanner (System.in);
        int input = reader.nextInt();
        while (input != 4){
            switch (input) {
                case 1:
                    zoo = driver.ReadZoo();
                    break;
                case 2:
                    driver.PrintMap(zoo);
                    break;
                case 3:
                    driver.DoTour(zoo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Masukan salah");
                    break;
            }
            reader = new Scanner (System.in);
            System.out.print("Proses telah selesai. Masukkan input kembali: ");
            input = reader.nextInt();
        }
    }
}
