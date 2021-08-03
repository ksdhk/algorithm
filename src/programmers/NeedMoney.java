package programmers;

public class NeedMoney {

        public long solution(int price, int money, int count) {
            long answer = -1;
            long result =0;
            for(int i=1;i<=count;i++){
                result+=price*i;
            }
            if(result>money){
                return result-money;
            }else{
                return 0;
            }
            // return answer;
        }

}
