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

/**Zoo
 * Kelas yang menangani matrix of cell yang merupakan peta virtual zoo
 */
public class Zoo {
    /**matrix of cell
     * matrix yang mewakili map dari zoo
     */
    private Cell [][] map;
    
    /**panjang
     * panjang peta virtual zoo
     */
    private int panjang;
    
    /**lebar
     * lebar peta virtual zoo
     */
    private int lebar;
    
    /**entrance_l
     * nilai melebar dari pintu masuk 
     */ 
    private int entrance_l;
    
    /**entrance_p
     * nilai memanjang dari pintu masuk
     */
    private int entrance_p;

    /**Constuctor
     * konstruktor yang menginisialisasi peta zoo
     */
    public Zoo(){
        panjang = 0;
        lebar = 0;
        map = new Cell [40][40];
        for (int i = 0 ; i < 40 ; i ++){
            map[i] = new Cell [40];
            for (int j = 0 ; j < 40 ; j++){
                map[i][j] = new Cell();
            }
        }
    }

    /**GetCell
     *Mengembalikan cell map y, x
     * @param y
     * indeks memanjang dari cell
     * @param x
     * indeks melebar dari cell
     * @return cell
     */
    public Cell GetCell(int y, int x){
        return map[y][x];
    }

    /**GetPanjang
     * mengembalikan panjang dari map zoo
     * @return int panjang
     */
    public int GetPanjang(){
        return panjang;
    }

    /**GetLebar
     * mengembalikan lebar dari map zoo
     * @return int lebar
     */
    public int GetLebar(){
        return lebar;
    }

    /**GetEntL
     * mengembalikan indeks melebar dari pintu masuk map zoo
     * @return int entrance_l
     */
    public int GetEntL(){
        return entrance_l;
    }

    /**GetEntP
     * mengembalikan indeks memanjang dari pintu masuk map zoo
     * @return int entrance_p
     */
    public int GetEntP(){
        return entrance_p;
    }

    /**SetPanjang
     * mengeset panjang map zoo
     * @param p
     * panjang yang akan diset ke map zoo
     */
    public void SetPanjang(int p){
        panjang = p;
    }

    /**SetLebar
     * mengeset lebar map zoo
     * @param l
     * lebar yang akan diset ke map zoo
     */
    public void SetLebar(int l){
        lebar = l;
    }

    /**SetEntP
     * mengeset indeks memanjang dari entrance
     * @param p
     * indeks memanjang dari entrance
     */
    public void SetEntP(int p){
        entrance_p = p;
    }

    /**SetEntL
     * mengeset indeks melebar dari entrance
     * @param l
     * indeks melebar dari entrance
     */
    public void SetEntL(int l){
        entrance_l = l;
    }

    /**IsRoute
     * mengecek apakah sel tersebut merupakan route
     * @param y
     * indeks y dari cell yang akan di cek
     * @param x
     * indeks x dari cell yang akan di cek
     * @return
     * kondisi, true jika cell tersebut merupakan sebuah route
     */
    public boolean IsRoute(int y, int x){
        return (map[y][x].GetFacility().GetCode()=='r');
    }

    /**CheckAround
     * mengecek cell di sekitar
     * @param y
     * indeks y dari cell yang akan di cek
     * @param x
     * indeks x dari cell yang akan di cek
     */
    public void CheckAround(int y, int x){
        if((y-1)>=0 && (y-1)<panjang){
            map[y-1][x].Interact();
        }
        if ((y+1)>=0 && (y+1)<panjang){
            map[y+1][x].Interact();
        }
        if ((x-1)>=0 && (x-1)<lebar){
            map[y][x-1].Interact();
        }
        if ((x+1)>=0 && (x+1)<lebar){
            map[y][x+1].Interact();
        }
    }
}
