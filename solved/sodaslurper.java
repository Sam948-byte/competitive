package solved;
import utils.FastReader;

public class sodaslurper {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int e = in.nextInt() + in.nextInt();
        int c = in.nextInt();

        int sodas = 0;

        while (e >= c) {
            int newSodas = e / c;
            e = e % c + newSodas;
            sodas += newSodas;
        }

        System.out.print(sodas);
    }
}
