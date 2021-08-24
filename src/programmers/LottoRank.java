package programmers;

public class LottoRank {

        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int aCnt = 0;
            int zCnt = 0;
            for(int i=0;i<lottos.length;i++){
                for(int j=0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        aCnt++;
                    }
                }
                if(lottos[i]==0){
                    zCnt++;
                }
            }
            answer[0]=makeRank(aCnt+zCnt);
            answer[1]=makeRank(aCnt);



            return answer;
        }

        public int makeRank(int rank){
            int a = 0;
            if(rank==6){
                a = 1;
            }else if(rank==5){
                a = 2;
            }else if(rank==4){
                a = 3;
            }else if(rank==3){
                a = 4;
            }else if(rank==2){
                a = 5;
            }else{
                a = 6;
            }
            return a;
        }


}
