package object_oriented_programming.call_by_value_reference;

//  * It changed actual value

//  * Stack memory store primitive data types and  reference variable
//  * heap memory store object 
public class CallByReference {
    String name;
    public void  changeName(CallByReference obj2){ // * Formal parameter
        obj2.name = "Shahin";
    }
    public static void main(String[] args) {
         CallByReference obj1 = new CallByReference();
         obj1.name= "Sabbir";
         System.out.println(obj1.name); // * Actual parameter
         obj1.changeName(obj1);
         System.out.println(obj1.name);

       
    }
}


