/**
 * List
 */

import java.util.ArrayList;
import java.util.Random;


public class List {

    ArrayList<Integer> list; 

    public void fillList() {
        
        for(int i = 0; i > 34; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Random random = new Random();
            int randomInteger = random.nextInt(100);            // random Int Werte zwischen 0 und 100 erstellen
            list.add(randomInteger);  
        }   
    }

    public ArrayList<Integer> getList() {
        int x = list.size();
        System.out.println(x);
        return list;
    }





    /*
    int x;
    
	public ArrayList<Integer> randomList() {                                  //Liste mit random int erstellen 

        ArrayList<Integer> list = new ArrayList<Integer>();

        
        Random random = new Random();                           

        for (int i = 0; i <= 34; i++) {

            int randomInteger = random.nextInt(100);            // random Int Werte zwischen 0 und 100 erstellen

            list.add(randomInteger);
            
            int x = list.get(i);
            System.out.println(x);  

            int listSize = list.size();                         
            System.out.println(listSize);
    
        }
    return list;
    }            
}

      */   

}
    

   

