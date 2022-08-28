package backjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coordinate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int listCnt = in.nextInt();

        ArrayList<Integer> listOdd = new ArrayList<Integer>();
        ArrayList<Integer> listEven = new ArrayList<Integer>();
        for(int i=0;i<listCnt*2;i++) {
            if(i%2==0) {
                listEven.add(in.nextInt());
            }else{
                listOdd.add(in.nextInt());
            }
        }

        Collections.sort(listEven);
        Collections.sort(listOdd);
        for(int i=0;i<listCnt;i++) {
            System.out.println(listEven.get(i)+ " " + listOdd.get(i));
        }

    }
}
