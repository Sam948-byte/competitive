package solved;

import utils.FastReader;

public class ninetyNineProblems {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        

        int m = n % 100;

        int out = 0;

        boolean up;

        up = m >= 49;

        if (n < 100) {
            out = 99;
        } else if (up) {
            out = n - m + 99;
        } else {
            out = n - m - 1;
        }

        System.out.print(out);

    }
}
