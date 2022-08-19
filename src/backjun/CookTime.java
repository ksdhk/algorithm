package backjun;

import java.util.Scanner;

public class CookTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Hour = in.nextInt();
        int Min = in.nextInt();
        int Time = in.nextInt();

        Min = Min+Time;

        if(Min>=60){
            int mult = Min/60;
            int etc = Min%60;
            Min= etc;
            Hour = Hour +mult;
        }
        if(Hour>=24){
            Hour = Hour-24;
        }

        System.out.println(Hour+" "+Min);
    }
}
