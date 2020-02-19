import java.util.Collections;

/**
 * Sorting
 * 
 */

public class Sorting {

    public void sort(int links, int rechts){
      
    } 
  
    public void teile(int links, int rechts) {

      int i = links;
      int j = rechts;

      //Objekt List erstellen und mit Werten befüllen

      List daten = new List();                  
      daten.fillList();
      daten.getList();

      // Element an der Pivot Position erhalten

        int pivot = daten.getPivot();
        boolean foundLarger = false;
        boolean foundSmaller = false;
          
        for(i = links , j = rechts -1 ; i <= j; i++, j--){

          System.out.println("Test i,j: " + i + ", " + j);

          if(daten.list.get(i) > pivot){
            foundLarger = true;
            System.out.println("foundLarger = true");
          }

          if(daten.list.get(j) < pivot){
            foundSmaller = true;
            System.out.println("foundSmaller = true");
          }

          if (foundLarger && foundSmaller == true){
            Collections.swap(daten.getList(), i, j);
            System.out.println("Swap!");
          }
        }

        if(i == j){}
    }
}


