package programmers;
import java.util.*;
public class MostLeast {


        public int[] solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            if(arr.length == 1) return new int[] {-1};
            int min = arr[0];
            for(int i =0; i<arr.length; i++){
                list.add(arr[i]);
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            while(list.contains(min)){
                int idx = list.indexOf(min);
                list.remove(idx);
            }
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++)
                answer[i] = list.get(i);
            return answer;
        }


}
