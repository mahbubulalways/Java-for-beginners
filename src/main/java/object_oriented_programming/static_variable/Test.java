package object_oriented_programming.static_variable;

public class Test {
    public static void main(String[] args) {

        // * Not need to make object to read static variable/member or method, We can direct use class name
        // StaticVariable obj = new StaticVariable();
        System.out.println(StaticVariable.universityName);
        System.out.println(StaticVariable.makeSquare(12));


        // * Use static variable
        UseStaticVariable student11 = new  UseStaticVariable("Shahriar Shahin", 36);
        UseStaticVariable student22 = new  UseStaticVariable("Moniruzaman", 9);
        student11.getInformation();
        student22.getInformation();


        // * GET TOTAL STUDENTS UNDER STUDENT CLASS
        Student student1 =new Student("Sabbir", 22);
        Student student2 =new Student("Shahin", 32);
        Student student3 =new Student("Monir", 12);
        Student student4 =new Student("Rehan", 52);
        Student student5 =new Student("Parves", 52);
        student5.getTotalStudents();
        Student student6 =new Student("Shahrin", 27);
        Student student7 =new Student("Shahrin", 27);
        Student student8 =new Student("Shahrin", 27);
        student6.getTotalStudents();

        
         //  * STATIC AND NON STATIC METHOD
         StaticMethod nonStatic = new StaticMethod(); // * Non-static method need to create object 
         nonStatic.displayOne();
         StaticMethod.displayTwo(); // * Static method no need to create object
          
        //  StaticBlock staticBlock1 = new  StaticBlock();
        //  staticBlock1.displayInfo();
        StaticBlock.displayInfo();
    }
}
