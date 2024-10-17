package object_oriented_programming.encapsulation;

public class DemoOne {
    // * Declare variables as a private. and use method to read and write variables.
    private  String name;
    
    public void  setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public static void main(String[] args) {
        DemoOne obj = new DemoOne();
        obj.setName("Mahbubul");
        String name = obj.getName();
        System.out.println(name);
    }
}
