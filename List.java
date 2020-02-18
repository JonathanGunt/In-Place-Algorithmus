/**
 * List
 */

import java.util.ArrayList;
import java.util.Random;


public class List {

    int x = 0;
    

	public void randomList() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Random random = new Random();

        for (int i = 0; i <= 33; i++) {

            int randomInteger = random.nextInt(100);

            list.add(randomInteger);
            
            int x = list.get(i);
            System.out.println(x);  
            
        } 

        int listSize = list.size();
        System.out.println(listSize);
    } 
    
   
}
