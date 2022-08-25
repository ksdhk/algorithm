package backjun;

import java.util.Scanner;

public class Whats {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        System.out.print("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다."+"\n");
        recur(cnt);
    }

    static String str = "";

    public static void recur(int N){
            String repeat = str;

            if(N==0) {
                System.out.print(repeat + "\"재귀함수가 뭔가요?\"" + "\n");
                System.out.print(repeat + "\"재귀함수는 자기 자신을 호출하는 함수라네\"" + "\n");
                System.out.print(repeat + "라고 답변하였지."+ "\n");
                return;
            }

        System.out.print(repeat + "\"재귀함수가 뭔가요?\"" + "\n");
        System.out.print(repeat + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." + "\n");
        System.out.print(repeat + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." + "\n");
        System.out.print(repeat + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"" + "\n");

        str += "____";

        recur(N-1);

        System.out.print(repeat + "라고 답변하였지."+ "\n");

    }

    }

