package object_oriented_programming.static_variable;

/**
 * StaticMethod
 */
public class StaticMethod {
    
    public void displayOne (){
        System.out.println("Hello, I am not a static method.");
    }
    
    // * Restriction of static method
    // * 1. Can not access non-static member  in static method
    // * 2. Not use this and super 
    static void displayTwo (){
        System.out.println("Hello, I am a static method.");
    }
    
}