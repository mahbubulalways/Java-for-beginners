package stringinjava;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str1 = new  StringBuffer("Mahbubul");
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
        str1= new  StringBuffer("Hasan");
        str1.append("Mahbubul");
        str1.delete(0, 2);
        System.out.println(str1);
    }
}
