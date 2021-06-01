package programmers;

public class StrangeChar {

        public String solution(String s) {
            String answer = "";
            for(int i=0;i<s.length();i++){
                if(!s.substring(i,i+1).equals(" ")){
                    if(i%2==0)
                        answer=answer+s.substring(i,i+1).toUpperCase();
                    else{
                        answer=answer+s.substring(i,i+1).toLowerCase();
                    }
                }else{
                    answer=answer+" ";
                }
            }


            return answer;
        }
   
}
