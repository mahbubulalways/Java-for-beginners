package wrapper_class_in_java;

public class StringConvertPrimitive {
    public static void main(String[] args) {
        // * convert primitive to String 
        int a = 12;
        String b = Integer.toString(a);
        System.out.println(a);
        System.out.println(b);
        boolean c = true;
        String d = Boolean.toString(c);
        System.out.println(d);

        // * convert String to primitive
        String e = "32";  
        int f = Integer.parseInt(e);
        System.out.println(f);
        String g = "101";  
        double h = Double.parseDouble(g);
        double i = Double.valueOf(g);
        System.out.println(h);
        System.out.println(i);
    }
}
