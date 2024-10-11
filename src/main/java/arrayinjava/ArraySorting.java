package arrayinjava;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5,3,2,7,6,1,9};
        String[] arr ={"A", "C", "B", "E", "D"};
        Arrays.sort(array);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));
    }
}
