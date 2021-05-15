package programmers;

public class MostLeast {


        public int[] solution(int[] arr) {
            if(arr.length==1){
                int[] answer = new int[1];
                answer[0] = -1;
                return answer;
            }

            int min = 0;

            for(int i=0;i<arr.length;i++){
                if(i==0){
                    min = arr[0];
                }else{
                    if(min>arr[i]){
                        min = arr[i];
                    };
                }
            };

            int[] answer = new int[arr.length-1];
            int minCnt = 0;
            for(int i=0;i<arr.length;i++){
                if(min == arr[i]){
                    arr[i] = arr[i+1];
                    minCnt++;
                }
            }


            return answer;
        }

}
