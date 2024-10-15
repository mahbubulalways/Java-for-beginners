package object_oriented_programming.OOPBasic;

public class Test {
    public static void main(String[] args) {
        // * Bangla system
        // Teacher teacher1 = new Teacher();
        // teacher1.name="Mahbubul Hasan";
        // teacher1.age=32;
        // teacher1.gender="Male";
        // teacher1.mobile="0199999999999";
        
        Teacher teacher1 = new Teacher("Mahbubul Hasan", 32, "0101", "Male" );
        Teacher teacher2 = new Teacher("Mahid", 22, "0101", "Male" );
        teacher1.getInformation(2);
        teacher2.getInformation(2);

        //  * Default Constructor
        Teacher teacher3 = new  Teacher();
        teacher3.getInformation(0);
        // System.out.println(teacher3);
        // System.out.println("{" + "\n" + " name: "+teacher1.name + "\n" + " age: " +teacher1.age +"\n" + " gender: "+ teacher1.gender+ "\n" + " mobile: " + teacher1.mobile + "\n" + "}");


        // * RETURNING VALUE FROM METHOD

        ReturningValue value = new ReturningValue();
        int result = value.square(5);
        System.out.println(result);
        
    }
}
