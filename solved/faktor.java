package solved;
import utils.FastReader;

public class faktor {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int articles = in.nextInt();

        double impact = in.nextInt();

        

        int scientists = 1;

        double fakeImpact = scientists / articles;

        while (fakeImpact < impact - 1) {
            scientists++;
            fakeImpact = scientists / articles;
        }

        System.out.print(scientists + 1);

    }
}
