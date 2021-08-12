package programmers;
import java.util.*;

public class TwoWeeks {



        public String calulateRank(double score){
            if(score >= 90.0)
                return "A";
            else if(score >= 80.0)
                return "B";
            else if(score >= 70.0)
                return "C";
            else if(score >= 50.0)
                return "D";
            else
                return "F";
        }

        public String solution(int[][] scores) {
            String answer = "";

            for(int j = 0; j < scores.length; j++){
                int selfScore = scores[j][j];
                int count = scores.length;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                boolean flag = true;
                int summary = 0;

                for(int i = 0; i < scores.length; i++){
                    int score = scores[i][j];

                    if( i != j && selfScore == score ){
                        flag = false;
                    }

                    min = Math.min(min, score);
                    max = Math.max(max, score);

                    summary += score;
                }

                if( flag && (min == selfScore || max == selfScore) ){
                    count--;
                    summary -= selfScore;
                }

                answer += this.calulateRank((double) summary / (double) count);
            }

            return answer;
        }
    }


