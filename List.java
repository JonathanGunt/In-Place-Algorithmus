/**
 * List
 */

import java.util.ArrayList;
//import java.util.Random;


public class List {

    ArrayList<Integer> list; 

    public void fillList() {
        this.list = new ArrayList<Integer>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        /*for(int i = 0; i < 34; i++) {                                          // Random Zahlen in der Liste einfügen
            Random random = new Random();
            int randomInteger = random.nextInt(100);                             // random Int Werte zwischen 0 und 100 erstellen
            System.out.println("Adding number into list: " + randomInteger);
            System.out.println("List size now: " + this.list.size());
            list.add(randomInteger);  
        }*/   
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    
}
    

   

