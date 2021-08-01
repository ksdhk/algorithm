package programmers;

public class SecretMap {

        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for(int i= 0; i< n ;i++){
                String Sharp = "";
                String binaryString1 = Integer.toBinaryString(arr1[i]);
                String binaryString2 = Integer.toBinaryString(arr2[i]);
                for(int k=binaryString1.length();k<n;k++){
                    binaryString1 = "0"+binaryString1;
                }
                for(int k=binaryString2.length();k<n ;k++){
                    binaryString2 = "0"+binaryString2;
                }

                for(int j=0; j<n;j++){
                    if(String.valueOf(binaryString1.charAt(j)).equals("1")||String.valueOf(binaryString2.charAt(j)).equals("1")){
                        Sharp=Sharp+"#";
                    }else{
                        Sharp=Sharp+" ";
                    }

                }
                answer[i] = Sharp;
            }
            return answer;
        }
   

}
