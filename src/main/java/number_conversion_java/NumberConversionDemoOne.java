package number_conversion_java;

public class NumberConversionDemoOne {
    public static void main(String[] args) {
        // * Convert binary, octal, hexa decimal to decimal 
         String binary = "1010";
         String octal ="675";
         String hexa= "A";
         int decimal =  Integer.parseInt(binary, 2);
         int decimal2 =  Integer.parseInt(octal, 8);
         int decimal3 =  Integer.parseInt(hexa, 16);
         System.out.println(decimal);
         System.out.println(decimal2);
         System.out.println(decimal3);
    }
}
