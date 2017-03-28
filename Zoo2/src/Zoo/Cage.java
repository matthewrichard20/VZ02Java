/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zoo;

/**
 * @author Lathifah Nurrahmah
 */

/**Cage
 * kelas cage yang menyimpan animal di dalamnya
 */
public class Cage {
    /**char code
     * kode pembeda dari cage
     */
    private char code;
    
    /**animal
     * animal yang berada pada cage tersebut
     */
    private Animal animal;
    /**Class constructor
     * konstruktor tanpa parameter yang menyatakan sebenarnya bukan cage 
     * (cage dummy)
     */
    public Cage(){
        code = '0';
        animal = new Animal ();
    }
    
    /**Class constructor
     * konstruktor dengan parameter yang menyatakan keberadaan cage
     * @param _code
     * kode animal yang berada pada cage. 
     */
    public Cage(char _code){
        if (_code == '1'){
            code = _code;
            animal = new Animal ();
        } else {
            code = _code;
            animal = new Animal (_code);
        }
    }

    /**SetAnimal
     * mengeset animal 
     * @param _code
     * kode animal yang akan diset ke dalam cage
     */
    public void SetAnimal (char _code){
        code = _code;
        animal = new Animal (_code);
    }

    /**GetAnimal
     * mengembalikan animal yang ada pada cage
     * @return animal
     */
    public Animal GetAnimal(){
        return animal;
    }

    /**GetCode
     * mengembalikan code dari cage
     * @return char code
     */
    public char GetCode(){
        return code;
    }

    /**Interact
     * Melakukan interaksi yang berupa deskripsi
     */
    public void Interact(){
        if (code=='1'){
            System.out.println("Kandang ini kosong");
        } else if (animal.GetCode() != '0'){
            System.out.println("Kandang ini berisi hewan " + animal.GetName());
            animal.Interact();
        }
    }
}
