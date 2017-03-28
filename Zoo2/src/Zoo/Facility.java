/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zoo;

/**
 * @author Lathifah Nurrahmah
 */

/**Facility
 * Kelas yang digunakan untuk membentuk fasilitas
 */
public class Facility {
    /**char code
     * kode pembeda dari kelas facility
     */
    private char code;
    
    /**String name
     * nama dari facility
     */
    private String name;
    
    /**Constructor
     * Mengkonstruksi fasilitas tanpa parameter
     */
    Facility(){
        name = "";
        code = '0';
    }
    
    /**Constructor
     * Mengkonstruksi fasilitas dengan tipe tertentu
     * @param c 
     * tipe pembeda dari fasilitas
     */
    Facility(char c){
        code = c;
        if (code == 'r'){
            name = "Route";
         } else if (c == 'R'){
            name = "Restaurant";
         } else if (c == 'E'){
            name = "Entrance";
         } else if (c == 'X'){
            name = "Exit";
         } else if (c == 'P'){
            name = "Park";
         }       
    }

    /**GetCode
     * Menagambil karakter pembeda dari fasilitas
     * @return code
     */
    public char GetCode(){
        return code;
    }

    /**Render
     * Menampilkan kode yang mewakili isi dari facility
     */
    public void Render(){
        if (code == 'r'){
            System.out.print('-');
        } else {
            System.out.print(code);
        }
    }

    /** Interact
     * Melakukan interaksi dengan facility 
     */
    public void Interact(){
          if (code=='R'){
            System.out.println("Restoran di kebun binatang.");
            System.out.println("Kalau lapar bisa datang ke sini.");
          } else if (code=='P'){
            System.out.println("Taman yang berisi banyak pohon dan bersih.");
            System.out.println("Tampaknya nyaman untuk duduk-duduk di sini.");
          }
    }
}
