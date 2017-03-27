/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Driver;

/**
 *
 * @author Lathifah Nurrahmah
 */

/**@class Point
 * Kelas yang menangani koordinat
 */
public class Point {
    int x;
    int y;
    /**@brief Constructor
     * Mengalokasi point tanpa parameter
     */
    public Point(){
       y = 0;
       x=0;
    }
    
    /**@brief Constructor
     * Mengalokasi point dengan parameter
     * @param _x
     * parameter koordinat x
     * @param _y
     * parameter koordinat y
     */
    public Point (int _x, int _y){
        x = _x;
        y = _y;
    }
    
    /**@brief IsSame
     * Mengembalikan nilai kebenaran apakah point yang dimasukkan
     * sama dengan objek atau tidak
     * @param point
     * Point lain yang dibandingkan dengan objek
     * @return boolean
     */
    public boolean IsSame (Point point){
        return (x == point.x && y == point.y);
    }
    
    /**
     * @return integer x
     * @brief GetX
     * Mengembalikan nilai x
     */
    public int GetX(){
        return x;
    }
    
    /**
     * @return  integer y
     * @brief GetY
     * Mengembalikan nilai y
     */
    public int GetY(){
        return y;
    }
    
    /**@brief SetX
     * Mengeset nilai x dengan _x
     * @param _x
     * nilai yang akan diset manjadi x
     */
    public void SetX(int _x){
        x = _x;
    }
    
    /**@brief SetY
     * Mengeset nilai y dengan _y
     * @param _y
     * nilai yang akan diset manjadi y
     */
    public void SetY(int _y){
        y = _y;
    }
    
    /**
     * @return  * @brief IsMember
     * Mengecek apakah objek merupakan anggota dari 
     * array of point p
     * @param p[]
     * array of point yang akan dicek
     * @param n
     * banyaknya array of point
     */
    public boolean IsMember (Point[] p, int n){
       boolean is_member = false;
       int i = 0;
       while (!is_member && i<n){
           if (p[i].x == x && p[i].y == y){
               is_member = true;
           }
           i++;
       }
       return is_member;
    }
    
}
