package programmers;

public class ZeroNumber {

        public int solution(int[] numbers) {
            int answer = -1;
            int tot = 45;
            for(int i=0; i<numbers.length;i++){
                tot= tot-numbers[i];
            }

            return tot;
        }


}


