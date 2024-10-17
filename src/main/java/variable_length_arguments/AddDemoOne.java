package variable_length_arguments;

public class AddDemoOne {
    void  add(int ...a){
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);

        
    }
}
