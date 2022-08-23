package backjun;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal A = in.nextBigDecimal();
        BigDecimal B = in.nextBigDecimal();

        BigDecimal C = A.add(B);

        System.out.println(C);
    }

}
