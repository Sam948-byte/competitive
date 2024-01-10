import java.math.BigInteger;
import java.util.Scanner;

public class fifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger improvements = new BigInteger(in.next());

        BigInteger perYear = new BigInteger(in.next());

        in.close();

        System.out.println(improvements.divide(perYear).add(new BigInteger("2022")));
    }
}
