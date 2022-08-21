package backjun;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tot = in.nextInt();
        int cnt = in.nextInt();
        int sum = 0;
        for(int i=0;i<cnt;i++){
            int price =  in.nextInt();
            int count =  in.nextInt();
            sum += price*count;
        }

        if(tot-sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
