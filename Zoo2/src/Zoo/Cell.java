/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zoo;

/**
 * @author Lathifah Nurrahmah
 */

/**Cell
 * kelas cell untuk membuat cell
 */
public class Cell {
    /**char code
     * kode pembeda untuk membedakan isi cell
     */
    private char code;
    
    /**habitat
     * objek habitat
     */
    private Habitat habitat;
    
    /**facility
     * objek facility
     */
    private Facility facility;
    /**Class constructor
     * konstruktor yang menginisialisasi habitat dan facility
     */
    Cell(){
        habitat = new Habitat();
        facility = new Facility();
    }

    /**SetHabitat
     * mengeset habitat berdasarkan parameter
     * @param code_habitat
     * code yang menyatakan habitat dari cell
     * @param code_animal
     * code yang menyatakan animal yang mengisi cage dari cell
     */
    public void SetHabitat(char code_habitat, char code_animal){
        habitat= new Habitat(code_habitat);
        habitat.SetCage(code_animal); 
    }

    /**SetHabitat
     * Membuat suatu habitat dummy yang sebenarnya tidak ada
     */
    public void SetHabitat(){
        habitat = new Habitat();
    }

    /**SetFacility
     * mengeset isi dari cell berdasarkan code_facility
     * @param code_facility
     * kode facility pembeda
     */
    public void SetFacility(char code_facility){
        if (code_facility == '0'){
            facility = new Facility();
        } else {
            facility = new Facility(code_facility);
        }
    }

    /**GetHabitat
     * Mengembalikan habitat dari cell
     * @return habitat
     */
    public Habitat GetHabitat(){
        return habitat;
    }

    /**GetFacility
     * Mengembalikan facility dari cell
     * @return facility
     */
    public Facility GetFacility(){
        return facility;
    }

    /**Render
     * menampilkan kode yang mewakili isi dari cell
     */
    public void Render(){
        if (habitat.GetCode() != '0'){
            habitat.Render();
        } else {
            facility.Render();
        }
    }

    /**Interact
     * melakukan interaksi dengan isi dari cell
     */
    public void Interact(){
        if (habitat.GetCode() != '0'){
            habitat.Interact();
        } else {
            facility.Interact();
        }
    }
}
