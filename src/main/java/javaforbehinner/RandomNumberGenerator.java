package javaforbehinner;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // * Bangla Sytem
        long random = Math.round(Math.random() * (int) 1000000);
        String makeString = Long.toString(random);
        System.out.println(random);
        System.out.println(makeString.length());

        // * Other
        Random ran = new Random();
        int randomNumber = ran.nextInt(10)+1; //* print 1 to 10
        System.out.println(randomNumber);
    }
}
