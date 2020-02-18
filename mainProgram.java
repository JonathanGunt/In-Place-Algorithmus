
/**
 * main
 */

public class mainProgram {
    public static void main(String[] args) {

        
        List myList = new List();
        myList.fillList();          
        myList.getList();

        int listSize = myList.getList().size();
        System.out.println(listSize);


   }
}


