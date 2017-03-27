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

/**@class Cage
 *
 */
public class Cage {
    private char code;
    private String name;
    private Animal animal;
    Cage(){
        code = '0';
        animal = new Animal ();
    }
    Cage(char _code){
        if (_code == '1'){
            code = _code;
            animal = new Animal ();
        } else {
            code = _code;
            animal = new Animal (_code);
        }
    }
    public void SetAnimal (char _code){
        code = '1';
        animal = new Animal (_code);
    }
    public Animal GetAnimal(){
        return animal;
    }
    public char GetCode(){
        return code;
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
