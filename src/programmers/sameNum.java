class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int size = common.length;
        if(common[1]-common[0]==common[2]-common[1]){ //등차
             answer = common[size-1]+(common[2]-common[1]);
        }else{   //등비;
             answer = common[size-1]*(common[2]/common[1]);
           
        }
        return answer;
    }
}
