package object_oriented_programming.static_variable;

public class UseStaticVariable {
    String name;
    int roll ;
    static String universityName = "Dhaka International University";

    public UseStaticVariable(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    
    public void getInformation(){
        System.out.println("{" + "\n" + "name: " + name + "\n" + "roll: " + roll + "\n" + "university: " + universityName + "\n" + "}");
    }

}
