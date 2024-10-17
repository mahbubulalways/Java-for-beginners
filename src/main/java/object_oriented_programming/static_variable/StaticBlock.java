package object_oriented_programming.static_variable;

public class StaticBlock {
    static int id;
    static String name;
    static {
       id=120;
       name = "Mahbubul";
       System.out.println("This is Static ");
    }
    public static void displayInfo(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
    }

    public static void main(String[] args) {
        StaticBlock.displayInfo();
    }
}
