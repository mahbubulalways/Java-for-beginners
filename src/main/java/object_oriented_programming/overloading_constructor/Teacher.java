package object_oriented_programming.overloading_constructor;

public class Teacher {
    String name, gender, mobile;
    int age;

    public Teacher() {
        System.out.println("No information");
    }

    public Teacher( String name, String gender){
        this.name=name;
        this.gender=gender; 
    }

    public Teacher( String name, String gender, String mobile, int age){
        this.name=name;
        this.gender=gender;
        this.mobile=mobile;
        this.age=age;
    }
    public void displayInformation(){
        System.out.println("{" + "\n" + " name: "+name + "\n" + " age: " +age +"\n" + " gender: "+ gender+ "\n" + " mobile: " + mobile + "\n" + "}");
    }
}
