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

/**@class Cell
 *
 */
public class Cell {
    private char code;
    private Habitat habitat;
    private Facility facility;
    Cell(){
        habitat = new Habitat();
        facility = new Facility();
    }
    public void SetHabitat(char code_habitat, char code_animal){
        habitat= new Habitat(code_habitat);
        habitat.SetCage(code_animal);        
    }
    public void SetHabitat(){
        habitat = new Habitat();
    }
    public void SetFacility(char code_facility){
        facility = new Facility(code_facility);
    }
    public Habitat GetHabitat(){
        return habitat;
    }
    public Facility GetFacility(){
        return facility;
    }
    public void Render(){
        if (habitat.GetCode() != '0'){
            habitat.Render();
        } else {
            facility.Render();
        }
    }
    public void Interact(){
        if (habitat.GetCode() != '0'){
            habitat.Interact();
        } else {
            facility.Interact();
        }
    }
}
