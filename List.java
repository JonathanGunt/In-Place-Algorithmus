/**
 * List
 */

import java.util.ArrayList;
//import java.util.Random;


public class List {

    ArrayList<Integer> list; 

    public void fillList() {
        this.list = new ArrayList<Integer>();

        list.add(6);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(6); 
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public int getPivot() {
        int sum = 0;
        for(int x = 0; x < list.size(); x++){
          sum += list.get(x);
        }

        int pivot = sum/list.size();
        System.out.println("Average: " + pivot);
        return pivot;
    }
}
    

   

