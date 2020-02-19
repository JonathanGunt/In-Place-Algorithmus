import java.util.Collections;

/**
 * Sorting
 * 
 */

public class Sorting {

    public void sort(int links, int rechts){
      
    } 
  
    public void teile(int links, int rechts) {

      //Objekt List erstellen und mit Werten befüllen

      List daten = new List();                  
      daten.fillList();
      daten.getList();

      // Element an der Pivot Position erhalten

      int ii = links;
      int jj = rechts -1;
      int i = 0;
      int j = rechts - 1;
      int pivot = daten.getPivot();

      while(ii < jj){

        for (i = 0 ; i < rechts && daten.getList().get(i) < pivot; i++) {
          ii = i + 1;
        }

        //System.out.println("Found a x ! " + i);

        for (j = rechts - 1; j > links && daten.getList().get(j) >= pivot; j--){
          jj = j - 1;  
        }

        //System.out.println("Found j ! " + j);
        
        if (ii < jj){
          Collections.swap(daten.getList(), i, j);
         // System.out.println("Swap!");
        }
      }

        System.out.println("--------------");
        System.out.println("Sorted List ! :");
      for (int k = 0; k < daten.list.size(); k++) {
        System.out.println(daten.list.get(k));
      }
    }
}


