package notSolved;
import java.math.BigDecimal;
import java.math.MathContext;
import utils.FastReader;

public class simplearithmetic {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        BigDecimal a = new BigDecimal(in.next());
        BigDecimal b = new BigDecimal(in.next());
        BigDecimal c = new BigDecimal(in.next());

        BigDecimal multiplied = a.multiply(b);
        MathContext mc = new MathContext(1000000);

        System.out.print(multiplied.divide(c, mc));
    }
}
