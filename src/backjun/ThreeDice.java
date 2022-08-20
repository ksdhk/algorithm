package backjun;

import java.util.Scanner;

public class ThreeDice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firNum = in.nextInt();
        int secNum = in.nextInt();
        int trdNum = in.nextInt();

        int Answer = 0;

        //모두 같을 때
        if(firNum==secNum&&secNum==trdNum){
            Answer = 10000+trdNum*1000;
        //모두 다를 때
        }else if(firNum!=secNum&&secNum!=trdNum&&firNum!=trdNum){
            int Max = 0;
            if(Max<firNum){
                Max = firNum;
            }
            if(Max<secNum){
                Max = secNum;
            }
            if(Max<trdNum){
                Max = trdNum;
            }
            Answer = Max *100;
        // 2개만 같을때
        }else{
            if(firNum==secNum){
                Answer = 1000+firNum*100;
            }
            if(secNum==trdNum){
                Answer = 1000+secNum*100;
            }
            if(firNum==trdNum){
                Answer = 1000+firNum*100;
            }
        }

        System.out.println(Answer);


    }
}
