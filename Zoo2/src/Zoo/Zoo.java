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

/**@class Zoo
 *
 */
public class Zoo {
    private Cell [][] map;
    private int panjang;
    private int lebar;
    private int entrance_l;
    private int entrance_p;
    public Zoo(){
        panjang = 0;
        lebar = 0;
        map = new Cell [panjang][lebar];
    }
    public Cell GetCell(int y, int x){
        return map[y][x];
    }
    public int GetPanjang(){
        return panjang;
    }
    public int GetLebar(){
        return lebar;
    }
    public int GetEntL(){
        return entrance_l;
    }
    public int GetEntP(){
        return entrance_p;
    }
    public void SetPanjang(int p){
        panjang = p;
    }
    public void SetLebar(int l){
        lebar = l;
    }
    public void SetEntP(int p){
        entrance_p = p;
    }
    public void SetEntL(int l){
        entrance_l = l;
    }
    public boolean IsRoute(int y, int x){
        return (map[y][x].GetFacility().GetCode()=='r');
    }
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
