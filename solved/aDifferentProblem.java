package solved;
import java.util.Scanner;

public class aDifferentProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLong()){
            long one = in.nextLong();
            long two = in.nextLong();

            in.close();

            System.out.println(Math.abs(one - two));
        }
    }
}
