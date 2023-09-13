package notSolved;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class simplearithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal a = new BigDecimal(in.next());
        BigDecimal b = new BigDecimal(in.next());
        BigDecimal c = new BigDecimal(in.next());

        in.close();

        BigDecimal multiplied = a.multiply(b);

        MathContext mc = new MathContext(1000000);

        System.out.print(multiplied.divide(c, mc));
    }
}
