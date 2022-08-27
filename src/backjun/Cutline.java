package backjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cutline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int listCnt = in.nextInt();
        int cnt = in.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<listCnt;i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list,Collections.reverseOrder());

        int answer = list.get(cnt-1);
        System.out.print(answer);
    }
}
