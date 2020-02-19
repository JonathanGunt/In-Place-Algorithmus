import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting
 * 
 */

public class Sorting {

    public void sort(int links, int rechts){
      
    } 
  
    public int teile(int links, int rechts) {

      //Objekt List erstellen und mit Werten befüllen

      List daten = new List();                  
      daten.fillList();
      daten.getList();

      // Element an der Pivot Position erhalten

        int pivot = daten.list.get(rechts);       
        boolean foundLarger = false;
        boolean foundSmaller = false;
          
        for(int i = links, j = rechts; i <= j; i++, j--){

          if(daten.list.get(i) > pivot){
            foundLarger = true;
          }

          if(daten.list.get(j) < pivot){
            foundSmaller = true;
          }

          if (foundLarger && foundSmaller == true){
            Collections.swap(daten, i, j);
          }

          if(i == j){
            return i;
          }
        }
    }
}


