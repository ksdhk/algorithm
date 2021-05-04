package programmers;
import java.util.*;

public class ChaSum {

     public int solution(int n) {
            int answer = 0;

            String nS = String.valueOf(n);

            for(int i =0;i<nS.length();i++){
                answer+=Integer.parseInt(nS.substring(i,i+1));
            }


            return answer;
        }


}
