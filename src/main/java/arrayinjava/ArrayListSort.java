package arrayinjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(-50);
        System.out.println("Before Sorting: "+number);
        Collections.sort(number);
        System.out.println("After Sorting in Ascending order: "+number);
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After Sorting in Descending order: "+number);
    }
}
