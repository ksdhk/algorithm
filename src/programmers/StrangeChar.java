package programmers;

public class StrangeChar {


        public String solution(String s) {
            String answer = "";
            int j  =0;
            for(int i=0;i<s.length();i++){
                if(!s.substring(i,i+1).equals(" ")){
                    if(j%2==0)
                        answer=answer+s.substring(i,i+1).toUpperCase();
                    else{
                        answer=answer+s.substring(i,i+1).toLowerCase();
                    }
                    j++;
                }else{
                    answer=answer+" ";
                    j=0;
                }
            }


            return answer;
        }
    

}
