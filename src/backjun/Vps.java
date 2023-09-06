package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Vps {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); //반복실행할 횟수

        StringBuilder answer = new StringBuilder();

        while(testCase-->0)
        {
            answer.append("\n");
        }
        System.out.println(answer);

    }


    public static String solve(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c=='('){
                stack.push(c);
            }

            else{
                stack.pop();
            }

        }

            return "No";
    }


}

