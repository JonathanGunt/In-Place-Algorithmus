/**
 * List
 */

import java.util.ArrayList;


public class List {
    List(){
        this.fillList();
    }

    ArrayList<Integer> list; 

    //ArrayList befüllen
    public void fillList() {
        this.list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4); 
        list.add(2);
    }

    //ArrayList übergeben
    public ArrayList<Integer> getList() {
        return list;
    }

    //Index des Pivot Elements übergeben
    public int getPivot() {
        int sum = 0;
        for(int x = 0; x < list.size(); x++){
          sum += list.get(x);
        }

        int average = sum/list.size();
        System.out.println("Average: " + average);
        
        return average;
    }
}
    

   

