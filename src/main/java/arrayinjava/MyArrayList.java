package arrayinjava;

import java.util.ArrayList;
import java.util.Iterator;
public class MyArrayList {
    public static void main(String[] args) {
       ArrayList<Integer> number = new ArrayList<Integer>();
       
    //* ADD ELEMENT */  
    
    number.add(10);
    number.add(20);
    number.add(30);
    number.add(2, 100);
    
    System.out.println(number);
    System.out.println(number.size());

    // *  enhanced for loop or for-each loop 
    System.out.println("For Each");
    for(int x:number){
     System.out.print(" " + x);
    }
    // * USE Iterator 
    System.out.println();
    System.out.println("Iterator");
    Iterator itr = number.iterator();
    while (itr.hasNext()) { 
        System.out.print(" "+ itr.next());
    }


    // * REMOVE
    //  number.remove(2);

    System.out.println();
    System.out.println("forEach");
    //*  Using forEach to iterate over key-value pairs
    number.forEach(action -> {
        System.out.print(" " + action);
    });
    System.out.println();
    System.out.println(number);

    // * MORE ACTION OF ARRAY LIST

    System.out.println("Clear Method");
    // number.clear();

    //*  SET GET
    number.set(3, 50);
   int value = number.get(0);
   System.out.println(value);


    System.out.println(number);
    
    boolean empty = number.isEmpty();
    System.out.println(empty);

    // * Check is exists
    boolean contain = number.contains(20);
    System.out.println(contain);

    int index = number.indexOf(30);
    System.out.println(index);


    }
}

