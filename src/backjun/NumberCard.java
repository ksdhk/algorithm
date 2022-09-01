package backjun;

import java.util.Scanner;

public class NumberCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int[] Mycard = new int[cnt];

        for(int i = 0 ; i< cnt; i++){
            Mycard[i] = in.nextInt();
        }


        int pCnt = in.nextInt();
        int[] result = new int[pCnt];

        for(int i = 0 ; i< pCnt; i++){
            result[i] = in.nextInt();
        }
        boolean trf = false;
        for(int i = 0 ; i< pCnt; i++){
            trf = false;
            for(int j=0; j< cnt ; j++) {
                if (Mycard[j] == result[i]) {
                    result[i] = 1;
                    trf = true;
                    break;
                }
            }

            if(!trf)
            result[i] = 0;
        }


        for(int i = 0 ; i< pCnt; i++){
            if(i+1!=pCnt)
                System.out.print(result[i]+" ");
            else{
                System.out.print(result[i]);
            }
        }


    }

}
