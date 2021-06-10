package programmers;

public class SosuFinid {

    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i=2; i<=n; i++) {
                boolean flag = true;
                for(int j=2; j<i; j++) { //두 번째 방법에서는 j<i 부분을 j<Math.sqrt(i) 로 바꾼다.
                    if(i%j==0) {
                        flag = false;
                        break;
                    }
                }

                if(flag==true) answer++;
            }

            return answer;
        }
    }

}
