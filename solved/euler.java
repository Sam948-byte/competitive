

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class euler {
    public static void main(String[] args) {
        //get input from command line
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.close();

        BigDecimal e = new BigDecimal(1);
        BigDecimal factorial = new BigDecimal("1");

        for (int i = 1; i <= n; i++) {
            System.out.println(e);
            factorial = factorial.multiply(new BigDecimal(String.valueOf(i)));
            e = e.add(BigDecimal.ONE.divide(factorial, 13, RoundingMode.HALF_UP));
        }

        System.out.println(e);
    }
}