package solved;
import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int articles = in.nextInt();

        double impact = in.nextInt();

        in.close();

        int scientists = 1;

        double fakeImpact = scientists / articles;

        while (fakeImpact < impact - 1) {
            scientists++;
            fakeImpact = scientists / articles;
        }

        System.out.print(scientists + 1);

    }
}
