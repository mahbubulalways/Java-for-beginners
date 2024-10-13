package number_conversion_java;

import java.util.Scanner;

public class NumberConversionDemoTwo {
    public static void main(String[] args) {
        // * Convert decimal  to binary, octal, hexa decimal
        int decimal;
        System.out.print("Please enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexa = Integer.toHexString(decimal);
        System.out.println("Binary: "+binary);
        System.out.println("Octal: "+octal);
        System.out.println("Hexa-Decimal: " +hexa);
    }
}
