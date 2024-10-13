package stringinjava;

public class StringPalindrome {
    public static void main(String[] args) {
        String word ="level";
        StringBuffer store = new StringBuffer(word);
        store.reverse();

        // * String not equal stringBuffer. Thats why we use toString method
         if(word.equals(store.toString())){
            System.out.println("This is palindrome string");
         }else{
            System.out.println("This is not palindrome string");
         }

    }
}
