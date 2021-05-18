package programmers;

public class NmultipleX {


        public long[] solution(long x, int n) {
            long[] answer = new long[n];
            long xF = x;
            for(int i=0;i<n;i++){
                answer[i] = x;
                x=x+xF;
            }

            return answer;
        }
    
}
