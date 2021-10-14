package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {


        class Task{
            int location;
            int priority;
            public Task (int location, int priority) {
                this.location = location;
                this.priority = priority;
            }
        }

        public int solution(int[] priorities, int location) {
            int answer = 0;

            Queue<Task> queue = new LinkedList<>();

            for(int i=0; i<priorities.length; i++){
                queue.add(new Task(i, priorities[i]));
            }

            int now=0;

            while(!queue.isEmpty()){
                Task cur = queue.poll();
                boolean flag = false;
                for(Task t : queue){
                    if(t.priority > cur.priority){
                        flag = true;
                    }
                }
                if(flag) { // 우선순위 높은게 있으면 뒤로 보낸다
                    queue.add(cur);
                }else{
                    now++;
                    if(cur.location == location) {
                        answer = now;
                        break;
                    }

                }
            }
            return answer;
        }



}
