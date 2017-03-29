/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Driver;

import Zoo.Zoo;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Lathifah Nurrahmah
 */

/**Driver
 * kelas yang menangani fungsi-fungsi besar virtual zoo
 */
public class Driver {

    /**ReadZoo()
     * fungsi untuk membaca suatu file yang memuat informasi peta zoo
     * @return zoo
     * @throws IOException
     * -
     */
    public Zoo ReadZoo() throws IOException{
        char[] input = null;
        int length = 0;
        File file = new File("map.txt");
        FileReader reader;
        reader = null;
        try{
            reader = new FileReader(file);
            length = (int) file.length();
            input = new char[length];
            reader.read(input);
            reader.close();
        } catch (IOException e){
        } finally {
            if(reader != null){
                reader.close();
            }
        }
        Zoo zoo = new Zoo();
        ConvertFromFile(input, zoo, length);
        PutAnimal(zoo);
        return zoo;
    }

    /**PrintMap
     * menyetak peta zoo
     * @param zoo
     * zoo yang ingin ditampilkan
     */
    public void PrintMap(Zoo zoo){
        for (int i = 0; i < zoo.GetPanjang(); i++){
            for (int j = 0; j < zoo.GetLebar(); j++){
                zoo.GetCell(i, j).Render();
            }
            System.out.println("");
        }      
    }

    /**PrintMap
     * menyetak peta zoo dengan parameter tambahan poin user
     * @param zoo
     * zoo yang ingin dicetak
     * @param user
     * nilai point keberadaan user
     */
    public void PrintMap(Zoo zoo, Point user){
        for (int i = 0; i < zoo.GetPanjang(); i++){
            for (int j = 0; j < zoo.GetLebar(); j++){
                if (i != user.GetY() || j != user.GetX()){
                    zoo.GetCell(i, j).Render();
                } else {
                    System.out.print('u');
                }
            }
            System.out.println("");
        }
    }

    /**DoTour
     * melakukan tur pada virtual zoo
     * @param zoo
     * Tur akan dilakukan pada zoo
     */
    public void DoTour(Zoo zoo){
        Point user = new Point(zoo.GetEntL(), zoo.GetEntP());
        boolean available = true;
        Point[] visited = new Point [100];
        int i = 0;
        visited[0]= user;
        while (available && 
            zoo.GetCell(user.GetY(), user.GetX()).GetFacility().GetCode() != 'X'){
            PrintMap(zoo, user);
            zoo.CheckAround(user.GetY(), user.GetX());
            System.out.println("");
            Point[] temp = new Point [4];
            temp[0] = new Point (user.GetX(), user.GetY()+1);
            temp[1] = new Point (user.GetX(), user.GetY()-1);
            temp[2] = new Point (user.GetX()+1, user.GetY());
            temp[3] = new Point (user.GetX()-1, user.GetY());
            boolean route_found = false;
            Random rand = new Random ();
            int j = rand.nextInt(4);
            int count = 0;
            int exit = 5;
            while (count < 4 && !route_found){
                if (IsPointRouteAvailable(temp[j], zoo, visited, i)){
                    route_found = true;
                    i++;
                    visited[i] = temp[j];
                    user = temp[j];
                } else if (zoo.GetCell(temp[j].GetY(), temp[j].GetX()).GetFacility().GetCode()=='X'){
                    exit = j;
                }
                count ++;
                j=(j+1)%4;
            }
            if (!route_found){
                if (exit != 5){
                    user = temp[exit];
                }
                available = false;
            }
        }
    }
    
    /**IsPointRoutAvailable
     * menembalikan kondisi apakah suatu point dapat dilewati oleh user atau tidal
     * dengan kriteria belum pernah dikunjungi
     * @param point
     * point yang akan dicek kondisinya
     * @param zoo
     * zoo point berada
     * @param visited
     * suatu array of point yang menyatakan point-point yang telah dilewati user
     * @param n
     * besarnya array of point
     * @return boolean yang menyatakan rute dapat dilewati
     */
    private boolean IsPointRouteAvailable (Point point, Zoo zoo, Point[] visited, int n){
        return (IsInArea(point, zoo) && !point.IsMember(visited,n) && 
                zoo.IsRoute(point.GetY(), point.GetX()));
    }
    
    
    /**IsInArea
     * mengembalikan kondisi apakah suatu point berada pada area zoo atau tidak
     * @param point
     * point yang akan dicek
     * @param zoo
     * virtual zoo yang dicek areanya
     * @return boolean apakah point berada pada area zoo
     */
    private boolean IsInArea(Point point, Zoo zoo){
        return (point.GetX() >= 0 && point.GetX() < zoo.GetLebar() && point.GetY() >= 0 &&
                point.GetY() < zoo.GetPanjang());
    }
    
    /**ConvertFromFile
     * mengimplementasikan data yang diperoleh dari file menjadi bentuk zoo
     * @param input
     * array of char yang menyatakan data yang diperoleh dari file
     * @param zoo
     * zoo yang akan menjadi implementasi dari data
     * @param length
     * panjang dari file input
     */
    private void ConvertFromFile(char[] input, Zoo zoo, int length){
        int y = 0;
        int x = 0;
        int lebar = 0;
        for (int i = 0; i < length ; i = i + 1){
            switch (input[i]){
                case '\n': 
                    y = y + 1;
                    lebar = x;
                    x = -1;
                    break;
                case '-':
                    zoo.GetCell(y, x).SetFacility('r');
                    zoo.GetCell(y, x).SetHabitat();
                    break;
                case 'w':
                case 'f':
                case 'l':
                    zoo.GetCell(y, x).SetHabitat(input[i],'0');
                    zoo.GetCell(y, x).SetFacility('0');
                    break;
                case 'W':
                    zoo.GetCell(y, x).SetFacility('0');
                    zoo.GetCell(y, x).SetHabitat('w','1');
                    break;
                case 'F':
                    zoo.GetCell(y, x).SetFacility('0');
                    zoo.GetCell(y, x).SetHabitat('f','1');
                    break;
                case 'L':
                    zoo.GetCell(y, x).SetFacility('0');
                    zoo.GetCell(y, x).SetHabitat('l','1');
                    break;
                case 'E':
                    zoo.SetEntL(x);
                    zoo.SetEntP(y);
                case 'P':
                case 'R':
                case 'X':
                    zoo.GetCell(y, x).SetFacility(input[i]);
                    zoo.GetCell(y, x).SetHabitat();
                    break;    
            }
            x = x+1;
        }
        zoo.SetLebar(lebar-1);
        zoo.SetPanjang(y+1);
    }
    
    /**PutAnimal
     * hard code menaruh hewan pada suatu posisi tertentu
     * @param zoo 
     * zoo yang dilakukan implementasi PutAnimal padanya
     */
    private void PutAnimal(Zoo zoo){
        zoo.GetCell(0, 1).SetHabitat('l','i');
        zoo.GetCell(0, 5).SetHabitat('w','r');
        zoo.GetCell(3, 0).SetHabitat('f','B');
        zoo.GetCell(3, 2).SetHabitat('f','b');
        zoo.GetCell(3, 5).SetHabitat('l','G');
        zoo.GetCell(3, 8).SetHabitat('l','H');
        zoo.GetCell(6, 1).SetHabitat('w','t');
        zoo.GetCell(6, 4).SetHabitat('l','z');
        zoo.GetCell(6, 6).SetHabitat('l','D');
        zoo.GetCell(6, 7).SetHabitat('l','m');
        zoo.GetCell(6, 8).SetHabitat('l','n');
        zoo.GetCell(7, 6).SetHabitat('f','o');
        zoo.GetCell(7, 8).SetHabitat('f','p');
        zoo.GetCell(7, 9).SetHabitat('l','d');
        zoo.GetCell(8, 0).SetHabitat('w','I');
        zoo.GetCell(10, 3).SetHabitat('w','S');
        zoo.GetCell(10, 5).SetHabitat('l','K');
        zoo.GetCell(10, 7).SetHabitat('w','c');
        zoo.GetCell(11, 4).SetHabitat('f','d');
    }

}
