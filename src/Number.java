import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Number {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int quotient = Integer.parseInt(br.readLine()); // 주어지는 수이자 나중에는 몫
        int cardinalNum = Integer.parseInt(br.readLine()); // 변환하고자 하는 진법
        String character = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Character> output = new ArrayList<>();

        bw.write("주어진 수이자 몫이되는 수 : "+ quotient); bw.newLine();
        bw.write("변환하고자 하는 진수 : " + cardinalNum); bw.newLine();

        while(quotient != 0) {
            output.add(character.charAt(quotient%cardinalNum)); // 나머지가 저장됨
            quotient /= cardinalNum;
        }

        Collections.reverse(output);

        bw.write("[");
        for(Character convertedNum : output) {
            bw.write(convertedNum);
        }
        bw.write("]");

        bw.flush();

    }

}