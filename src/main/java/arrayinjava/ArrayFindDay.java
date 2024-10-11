package arrayinjava;

import java.util.Scanner;

public class ArrayFindDay {
    public static void main(String[] args) {
        int day;
        String selectedDay;
        String[] days= new String[8];

         // * BANGLA SYSTEM PART 1
        // days[0]="";
        // days[1]="Saturday";
        // days[2]="Sunday";
        // days[3]="Monday";
        // days[4]="Tuesday";
        // days[5]="Wednesday";
        // days[6]="Thursday";
        // days[7]="Friday";

        days[0]="Saturday";
        days[1]="Sunday";
        days[2]="Monday";
        days[3]="Tuesday";
        days[4]="Wednesday";
        days[5]="Thursday";
        days[6]="Friday";
        
        System.out.print("Enter Day Number 1-7 : ");
        Scanner input= new Scanner(System.in);
        day = input.nextInt();
        // * BANGLA SYSTEM 2
        // selectedDay= days[day];
        // System.out.println("This day is " + selectedDay);


        for(int i = 0; i<days.length; i++){
            if(i == day - 1){
                selectedDay= days[i];
                System.out.println("This day is " + selectedDay);
            }
        }


        
    }
}
