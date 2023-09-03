package programmers;

import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = a+b;

        c= c.trim();
        System.out.println(c);
    }
}
