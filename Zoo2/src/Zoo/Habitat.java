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

/**Habitat
 * Kelas yang menangani keberadaan suatu habitat tertentu pada virtual zoo
 */
public class Habitat {
    /**char code
     * kode pembeda kelas habitat
     */
    private char code;
    
    /**String name
     * nama dari habitat
     */
    private String name;
    
    /**cage
     * kandang yang ada pada habitat
     */
    private Cage cage;
    
    /**Constructor
     * konstruktor tanpa parameter yang menyatakan habitat kosong
     */
    Habitat(){
        name = "";
        code = '0';
        cage = new Cage();
    }
    
    /**Constructor
     * konstruktor dengan parameter yang menyatakan keberadaan habitat
     * @param c 
     * kode dari habitat, bisa memiliki cage dan bisa pula tidak
     */
    Habitat(char c){
        code = c;
        switch (c) {
            case 'w':
            case 'W':
                name = "air";
                break;
            case 'l':
            case 'L':
                name = "darat";
                break;
            case 'f':
            case 'F':
                name = "udara";
                break;
            default:
                break;
        }
        if (c=='W' || c=='L' || c=='F'){
            cage = new Cage('l');
        } else {
            cage = new Cage('0');
        }
    }

    /**SetCage
     * Menginisiasi cage dengan tipe pembeda dari habitat
     * @param _code tipe pembeda dari habitat
     */
    public void SetCage(char _code){
        cage = new Cage(_code);
    }   

    /**GetGCage
     * mengambil cage yang dituju
     * @return cage
     */
    public Cage GetCage(){
        return cage;
    }

    /**GetCode
     * Mengambil code dari habitat
     * @return char code
     */
    public char GetCode(){
        return code;
    }

    /**Render
     * menampilkan kode yang mewakili habitat
     */
    public void Render(){
        if (cage.GetCode() == '0'){
            System.out.print(code);
        } else if (cage.GetCode() == '1'){
            if (code == 'w'){
                System.out.print('W');
            } else if (code == 'f'){
                System.out.print('F');
            } else if (code == 'l'){
                System.out.print('L');
            }
        } else if (cage.GetAnimal().GetCode() != '0'){
            cage.GetAnimal().Render();
        }
    }

    /**Interact
     * Melakukan interaksi dengan habitat
     */
    public void Interact(){
        System.out.print("Habitat ");
        System.out.println(name);
        cage.Interact();
    }
    
}
