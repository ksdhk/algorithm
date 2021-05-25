package programmers;

public class Colaz {


        public int solution(int num) {
            long num1 = num;
            int answer = 0;
            if(num1==1)return 0;

            while(num1!=1){
                if(num1%2==0){
                    num1=num1/2;
                }else{
                    num1=num1*3+1;
                }
                answer++;
                if(answer==500){
                    return -1;
                }
            }


            return answer;
        }


}
