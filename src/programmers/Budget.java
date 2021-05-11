package programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int cnt = 0;
        for(int i=0;i<d.length;i++){
            answer=answer+d[i];
            System.out.println(answer);
            if(answer>budget){break; }
            cnt++;
        }
        return cnt;
    }
}
