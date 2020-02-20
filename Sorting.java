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

      // Element an der Pivot Position erhalten
      
      int i = links;
      int j = rechts - 1;
      //int pivot = this.daten.getPivot();
      int pivot = this.daten.getList().get(rechts);

      System.out.println("links " + links + " rechts " + rechts);
      System.out.println("Pivot " + pivot);
      

      while(i < j){

        System.out.println("i; RECHTS, 'value < pivot': " + i + "," + rechts + "," + daten.getList().get(i) + " < " + pivot);
        for (; i < rechts && daten.getList().get(i) < pivot;) {  
          i = i + 1;
          System.out.println("i; RECHTS, 'value < pivot': " + i + "," + rechts + "," + daten.getList().get(i) + " < " + pivot);
        }

        System.out.println("j; links, 'value >= pivot': " + j + "," + links + "," + daten.getList().get(j) + " >= " + pivot);
        for (; j > links && daten.getList().get(j) >= pivot;){
          j = j - 1;            
          System.out.println("j; links, 'value >= pivot': " + j + "," + links + "," + daten.getList().get(j) + " >= " + pivot);
        }
        System.out.println("new i,j: " + i + "," +j);
        if (i < j){
          System.out.println("swapping i,j: " + i + "," +j);
          System.out.println("swapping [i],[j]: " + daten.getList().get(i) + "," +daten.getList().get(j));
          Collections.swap(daten.getList(), i, j);
        }
      }

      Collections.swap(daten.getList(), rechts, i);
      System.out.println("Swapping i and rechts");


      // Sortierte Teilliste output 
      System.out.println("--------------");
      System.out.println("Sorted List ! :");

      for (int k = 0; k < daten.list.size(); k++) {
        System.out.println(daten.list.get(k));
      }
      System.out.println("Return Value: " + i);
      return i;
      
        
    }
}


