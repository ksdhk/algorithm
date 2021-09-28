package programmers;

import java.util.Scanner;

public class Codeforce210929 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tCnt = sc.nextInt();
        int bCnt = 0;

        for (int i = 0; i < tCnt; i++) {
            String letter = sc.next();
            for (int j = 0; j < letter.length(); j++) {
                if (letter.substring(j,j+1).equals("B")) {
                    bCnt++;
                }
            }
            if (letter.length() / 2 == bCnt && letter.length()%2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            bCnt=0;
        }
    }

}
