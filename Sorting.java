import java.util.Collections;

/**
 * Sorting
 * 
 */

public class Sorting {

    List daten = new List();

    public void sort(int links, int rechts){

      int teiler;

      if(links < rechts){
        teiler = teile(links, rechts);
        System.out.println("Teiler " + teiler);
        sort(links, teiler -1);
        sort(teiler +1, rechts);
      }
    } 

    public int teile(int links, int rechts) {

      //Pivot Position erhalten
      int i = links;
      int j = rechts - 1;
      int pivot = this.daten.getList().get(rechts);

      System.out.println("links " + links + " rechts " + rechts);
      System.out.println("Pivot " + pivot);
      
      while(i < j){

        for (; i < rechts && daten.getList().get(i) < pivot;) {  
          i = i + 1;
        }

        for (; j > links && daten.getList().get(j) >= pivot;){
          j = j - 1;            
        }

        if (i < j){
          System.out.println("swapping [i],[j]: " + daten.getList().get(i) + "," +daten.getList().get(j));
          Collections.swap(daten.getList(), i, j);
        }
      }

      //Pivot tauschen
      Collections.swap(daten.getList(), rechts, i);
      
      // Sortierte Teilliste output 
      System.out.println("--------------");
      System.out.println("Sorting List ! :");

      for (int k = 0; k < daten.list.size(); k++) {
        System.out.println(daten.list.get(k));
      }
      return i;  
    }
}


