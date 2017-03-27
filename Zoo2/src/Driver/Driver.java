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

/**
 *
 * @author Lathifah Nurrahmah
 */

/**@class Driver
 *
 */
public class Driver {
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
            e.printStackTrace();
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
    public void PrintMap(Zoo zoo){
        
    }
    public void PrintMap(Zoo zoo, Point user){
        
    }
    public void DoTour(Zoo zoo){
        
    }
    private void ConvertFromFile(char[] input, Zoo zoo, int length){
        int y = 0;
        int x = 0;
        for (int i = 0; i < length ; i = i + 1){
            switch (input[i]){
                case '\n': 
                    y = y + 1;
                    x = -1;
                    break;
                case '-':
                    zoo.GetCell(y, x).SetFacility('r');
                    zoo.GetCell(y, x).SetHabitat();
                    break;
                case 'w':
                case 'f':
                case 'l':
                    zoo.GetCell(y, x).SetFacility('0');
                    zoo.GetCell(y, x).SetHabitat(input[i],'0');
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
    }
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
