/**
 * List
 */

import java.util.ArrayList;
//import java.util.Random;


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

       /* boolean foundPivot = false;
        int indexOfPivot = 0;
        int indexCounter = 0;

            while (foundPivot == false) {
                if(list.indexOf(average + indexCounter) != -1 || list.indexOf(average - indexCounter) != -1 ){
                    foundPivot = true;
                    indexOfPivot = list.indexOf(average + indexCounter);
                }else{
                    indexCounter ++;
                }
                
            }
        
        //System.out.println("IndexOfPivot: " + indexOfPivot);
        */
        return average;
    }
}
    

   

