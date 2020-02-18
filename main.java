
/**
 * main
 */

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i <= 33; i++) {

            int randomInteger = random.nextInt(100);

            list.add(randomInteger);
            System.out.println(list.get(i));

        }
    }
}
