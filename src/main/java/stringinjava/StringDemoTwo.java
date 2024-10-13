package stringinjava;

import java.util.Arrays;

public class StringDemoTwo {
    public static void main(String[] args) {
        String firstName = "mahbubul";
        String lastName = " Hasan";
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
        boolean start = lastName.startsWith("H");
        System.out.println(start);
        System.out.println(firstName.codePointAt(0)); // * Ascii value 

        // * Split
        String name ="Mahbubul Hasan";
        String[] s =name.split(" ");
        String rep = name.replace('M', 'K');
        System.out.println(rep);
        System.out.println(Arrays.toString(s));
        
    }
}
