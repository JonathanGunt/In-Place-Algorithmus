
/**
 * main
 */

public class mainProgram {
    public static void main(String[] args) {

        /*
        List myList = new List();
        myList.fillList();          
        myList.getList();

        int listSize = myList.getList().size();
        System.out.println("List size is: " + listSize);
        System.out.println("------------");

        for (int i = 0; i < listSize; i++){
            System.out.println(myList.getList().get(i));
        }
        */
        Sorting mytestList = new Sorting();
        mytestList.sort(0, mytestList.daten.list.size() - 1);
   }

}


