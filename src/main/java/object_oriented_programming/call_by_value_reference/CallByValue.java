package object_oriented_programming.call_by_value_reference;

public class CallByValue {
    //  * It not changed actual value
    public void change(int a){ // * Formal parameter
        a = 5;
    }
    public static void main(String[] args) {
       int value = 10;
       System.out.println(value); 
       CallByValue obj = new  CallByValue();
       obj.change(value);  // * Actual parameter
       System.out.println(value);
    }
}
