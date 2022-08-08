package backjun;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];

        for(int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println((1-arr[0])+" "+(1-arr[1])+" "+(2-arr[2])+" "+(2-arr[3])+" "+(2-arr[4])+" "+(8-arr[5]));

    }
}
