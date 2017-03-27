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

/**@class Habitat
 * Menje
 */
public class Habitat {
    private char code;
    private String name;
    private Cage cage;
    Habitat(){
        name = "";
        code = '0';
    }
    Habitat(char c){
        code = c;
        if (c=='w' || c=='W'){
            name = "Water";
        } else if (c=='l' || c=='L'){
            name = "Land";
        } else if (c=='f' || c=='F'){
            name = "Air";
        }
        if (c=='W' || c=='L' || c=='F'){
            cage = new Cage('l');
        } else {
            cage = new Cage('0');
        }
    }
    public void SetCage(char _code){
        cage = new Cage(_code);
    }   
    public Cage GetCage(){
        return cage;
    }
    public char GetCode(){
        return code;
    }
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
    public void Interact(){
        System.out.print("Habitat ");
        System.out.println(name);
        if (cage.GetCode() != '0'){
            cage.Interact();
        }
    }
    
}
