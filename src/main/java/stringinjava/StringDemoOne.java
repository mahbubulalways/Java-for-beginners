package stringinjava;

public class StringDemoOne {
   public static void main(String[] args) {
    
    String str1 = "Mahbubul";
    String str2 = new String("Hasan");
    
    char[] str3 = {'S', 'A', 'B', 'B', 'I', 'R'};


    
    System.out.println(str1 + " " +str2 );
    System.out.println(str3);
    int length= str1.length();
    boolean isEqual = str1.equals(str2); //* equal / equals */
    isEqual = str1.contains(str2);
    isEqual = str1.equalsIgnoreCase(str2); // ignore case
    System.out.println(length);
    System.out.println(isEqual);
    

   } 
}
