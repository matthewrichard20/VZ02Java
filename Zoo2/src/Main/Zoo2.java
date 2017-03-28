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
        System.out.println("Pilihan masukan untuk Virtual Zoo");
        System.out.println("1. Baca file");
        System.out.println("2. Tampilkan peta awal");
        System.out.println("3. Lakukan simulasi tur");
        System.out.println("4. Keluar");
        System.out.print("Masukkan indeks pilihan: ");
        Scanner reader = new Scanner (System.in);
        int input = reader.nextInt();
        while (input != 4){
            switch (input) {
                case 1:
                    zoo = driver.ReadZoo();
                    System.out.print("Proses telah selesai.");
                    break;
                case 2:
                    driver.PrintMap(zoo);
                    System.out.print("Proses telah selesai.");
                    break;
                case 3:
                    driver.DoTour(zoo);
                    System.out.print("Proses telah selesai.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Masukan salah");
                    break;
            }
            reader = new Scanner (System.in);
            
            
            System.out.println("Pilihan masukan untuk Virtual Zoo");
            System.out.println("1. Baca file");
            System.out.println("2. Tampilkan peta awal");
            System.out.println("3. Lakukan simulasi tur");
            System.out.println("4. Keluar");
            System.out.print("Masukkan indeks pilihan: ");
            input = reader.nextInt();
        }
    }
}
