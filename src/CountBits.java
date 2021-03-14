import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountBits {


    public static int countBits(int number){
        List<Character> output = new ArrayList<>();
        String character = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Result = 0;

        while(number != 0) {
            output.add(character.charAt(number%2)); // 나머지가 저장됨
            number /= 2;
        }

        Collections.reverse(output);

       for(Character convertedNum : output) {
           System.out.println("@@@"+convertedNum);
           if(convertedNum.equals(1)){
               System.out.println("@@@"+Result);
               Result= Result++;
           }
        }



         return Result;
    }

    public static void main(String[] args) {
        int result = countBits(7);
        System.out.println(result);
    }


}
