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

/**@class Animal
 * Kelas yang menangani hewan-hewan pada zoo
 */
public class Animal {
    private char code;
    private String name;
    private String type;
    private String sound;
    private char habitat_type;
    /**@brief
     * 
     */
    public Animal(){
        code = '0';
        name = "";
        type = "";
        sound = "";
        habitat_type = '0';
    }
    public Animal(char _code){
        code = _code;
        switch (_code) {
            case 'i':
                name = "Singa";
                type = "mamalia";
                sound = "ROAR!";
                habitat_type = 'l';
                break;
            case 'G':
                name = "Jerapah";
                type = "mamalia";
                sound = "...";
                habitat_type = 'l';
                break;
            case 'e':
                name = "Elang";
                type = "aves";
                sound = "Koak";
                habitat_type = 'f';
                break;
            case 'n':
                name = "Ular";
                type = "reptil";
                sound = "Sshhh";
                habitat_type = 'l';
                break;
            case 'r':
                name ="Pari";
                type = "pisces";
                sound = "Blub";
                habitat_type = 'w';
                break;
            case 'B':
                name = "Kupu-kupu";
                type = "serangga";
                sound = "...";
                habitat_type = 'f';
                break;
            case 'P':
                name ="Penguin";
                type = "aves";
                sound = "Citciit";
                habitat_type = 'w';
                break;
            case 't':
                name = "Harimau";
                type = "mamalia";
                sound = "Auuum";
                habitat_type = 'l';
                break;
            case 'S':
                name = "Hiu";
                type = "pisces";
                sound = "Groaar!";
                habitat_type = 'w';
                break;
            case 'z':
                name = "Zebra";
                type = "mamalia";
                sound = "...";
                habitat_type = 'l';
                break;
            case 'b':
                name = "Kelelawar";
                type = "mamalia";
                sound = "Citciit";
                habitat_type = 'f';
                break;
            case 'H':
                name = "Kuda nil";
                type = "mamalia";
                sound = "Ngooo";
                habitat_type = 'l';
                break;
            case 'p':
                name ="Merpati";
                type = "aves";
                sound = "Krr Krrr";
                habitat_type = 'f';
                break;
            case 'C':
                name = "Cendrawasih";
                type = "aves";
                sound = "Suiiit";
                habitat_type = 'f';
                break;
            case 'T':
                name = "Blue tang";
                type = "pisces";
                sound = "blubblub";
                habitat_type = 'w';
                break;
            case 'I':
                name = "Ikan badut";
                type = "pisces";
                sound = "blubblub";
                habitat_type = 'w';
                break;
            case 'c':
                name = "Buaya";
                type = "reptil";
                sound = "Groaar";
                habitat_type = 'w';
                break;
            case 'D':
                name = "Bunglon";
                type = "reptil";
                sound = "Ngiiii";
                habitat_type = 'l';
                break;
            case 'K':
                name ="Komodo";
                type = "reptil";
                sound = "Sssst";
                habitat_type = 'l';
                break;
            case 'o':
                name = "Kecoak";
                type = "serangga";
                sound = "...";
                habitat_type = 'f';
                break;
            case 'm':
                name = "Belalang";
                type = "serangga";
                sound = "...";
                habitat_type = 'l';
                break;
            case 'd':
                name = "Capung";
                type = "serangga";
                sound = "...";
                habitat_type = 'f';
                break;
            default:
                break;
        }
    }

    /**
     *
     * @return
     */
    public char GetCode(){
        return code;
    }

    /**
     *
     * @return
     */
    public String GetName(){
        return name;
    }

    /**
     *
     */
    public void Render(){
        System.out.print(code);
    }

    /**
     *
     */
    public void Interact(){
        System.out.print(name);
        System.out.print(" termasuk ke dalam binatang ");
        System.out.println(type);
        System.out.println(sound);
    }
}
