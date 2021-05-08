package programmers;

public class ReverseNumber {
    public int[] solution(long n) {


        String nStr = String.valueOf(n);
        int[] answer = new int[nStr.length()];
        int j = 0;
        for(int i=nStr.length()-1;i>-1;i--){
            answer[i]=Integer.parseInt(nStr.substring(j,j+1));
            j++;
        }

        return answer;
    }


}
