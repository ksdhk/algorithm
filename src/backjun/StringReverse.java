package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringReverse {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine()); //반복실행할 횟수

    StringBuilder answer = new StringBuilder();
    StringTokenizer st;

	while(testCase-->0)
    {
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder(st.nextToken());
            answer.append(sb.reverse() + " ");  //각 단어를 뒤집고 answer에 붙이기
        }
        answer.append("\n");


    }
    System.out.println(answer);

    }

}