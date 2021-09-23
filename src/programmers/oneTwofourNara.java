package programmers;

public class oneTwofourNara {
        public String solution(int n) {
            // 1자리 -> 1~3, 2자리 -> 4~12, 3자리 13 ~ 39
            // 3의 제곱승 씩 개수 증가
            // 3 나머지 연산 통해 자리수 카운트 (단, 나누어떨어질 경우 자리수 고려)

            String answer = "";
            int cn = n;

            while(cn>0){
                // 3 나머지 -> 4, 1, 2
                if (cn % 3 == 0){
                    answer = "4" + answer;
                    cn--; // 나누어 떨어질 경우 자리수 바뀜
                }else if(cn % 3 == 1){
                    answer = "1" + answer;
                }else{
                    answer = "2" + answer;
                }
                cn /=3;
            }

            return answer;
        }
}
