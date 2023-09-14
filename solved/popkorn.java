package solved;

import java.math.BigDecimal;
import java.util.Scanner;

public class popkorn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal contestants = new BigDecimal(in.nextLong());
        // System.out.println(contestants);
        BigDecimal groups = contestants.divide(new BigDecimal(4));
        // System.out.println(groups);
        BigDecimal round = groups.multiply(groups.subtract(new BigDecimal(1)));
        // System.out.println(round);
        BigDecimal robin = round.divide(new BigDecimal(2));
        // BigDecimal round = (groups * (groups - 1) / 2);
        // System.out.println(robin);
        System.out.print(new BigDecimal(4).add(robin.multiply(new BigDecimal(4))));
    }
}
