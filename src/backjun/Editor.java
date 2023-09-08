package backjun;

import java.io.InputStreamReader;
import java.util.Stack;
import java.io.*;

public class Editor {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter (new OutputStreamWriter(System.out));

        Stack<String> leftSt = new Stack<String>();
        Stack<String> rightSt = new Stack<String>();

        String[] str =br.readLine().split("");

        for(String s : str) { //Enhanced For Loop 사용
            leftSt.push(s);
        }
        int N = Integer.parseInt(br.readLine());	//명령어 개수

        for(int i = 0; i < N; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch(c) {
                case 'L':
                    if(!leftSt.isEmpty())
                        rightSt.push(leftSt.pop());

                    break;
                case 'D':
                    if(!rightSt.isEmpty())
                        leftSt.push(rightSt.pop());

                    break;
                case 'B':
                    if(!leftSt.isEmpty()) {
                        leftSt.pop();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    leftSt.push(String.valueOf(t));
                    //leftSt.push(st.nextToken());

                    break;
                default:
                    break;
            }
        }

        while(!leftSt.isEmpty())
            rightSt.push(leftSt.pop());

        while(!rightSt.isEmpty())
            bw.write(rightSt.pop());

        bw.flush();
        br.close();
        bw.close();
    }// main()

}
