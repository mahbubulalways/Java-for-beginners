package object_oriented_programming.OOPBasic;

public class Teacher {
    String name, gender, mobile;
    int age;

    // * Constructor for the Teacher class / parameterized constructor
    public Teacher(String name, int age, String mobile, String  gender){
        this.name=name;
        this.age = age;
        this.mobile=mobile;
        this.gender=gender;

    }

    public  Teacher(){
        System.out.println("Default Constructor. Without parameter.");
    }

    // * Method to display the Teacher's details
    public void  getInformation(int value){
        System.out.println("{" + "\n" + " name: "+name + "\n" + " age: " +age*value +"\n" + " gender: "+ gender+ "\n" + " mobile: " + mobile + "\n" + "}");
    }

}
