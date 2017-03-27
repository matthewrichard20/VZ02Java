/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zoo;

/**
 *
 * @author Lathifah Nurrahmah
 */

/**@class Facility
 *
 */
public class Facility {
    private char code;
    private String name;
    Facility(){
        name = "";
        code = '0';
    }
    Facility(char c){
        code = c;
        if (c == 'r'){
            name = "Route";
         } else if (c=='R'){
            name = "Restaurant";
         } else if (c=='E'){
            name = "Entrance";
         } else if (c=='X'){
            name = "Exit";
         } else if (c=='P'){
            name = "Park";
         }       
    }
    public char GetCode(){
        return code;
    }
    public void Render(){
        if (code == 'r'){
            System.out.print('-');
        } else {
            System.out.print(code);
        }
    }
    public void Interact(){
          if (code=='R'){
            System.out.println("Restoran di kebun binatang.");
            System.out.println("Kamu mau pesan apa?");
          } else if (code=='P'){
            System.out.println("Taman yang berisi banyak pohon dan bersih.");
            System.out.println("Mau duduk dulu?");
          }
    }
}
