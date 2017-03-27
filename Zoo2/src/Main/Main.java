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

/**@class Main
 *
 */
public class Main {
    public Main() {
        Zoo zoo = new Zoo();
        Scanner reader = new Scanner (System.in);
        int input = reader.nextInt();
        switch (input) {
            case 1:
                zoo = ReadZoo();
                break;
            case 2:
                ShowMap(zoo);
                break;
            case 3:
                DoTour(zoo);
                break;
            default:
                System.out.println("Masukan salah");
                break;
        }
    }
}
