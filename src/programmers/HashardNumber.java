package programmers;

public class HashardNumber {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            String xString = String.valueOf(x);
            int ans = 0;
            for(int i=0;i<xString.length();i++){
                ans=ans+Integer.parseInt(xString.substring(i,i+1));
            }
            int result = x%ans;

            if(result==0){
                answer = true;
            }else{
                answer = false;
            }

            return answer;
        }
    }

}
