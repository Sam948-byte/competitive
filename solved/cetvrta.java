package solved;

import utils.FastReader;

public class cetvrta {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int[][] pairs = new int[3][2];
        int first = 0;
        int second = 0;

        for (int i = 0; i < 3; i++) {
            pairs[i][0] = in.nextInt();
            pairs[i][1] = in.nextInt();
        }

        if (pairs[0][0] == pairs[1][0]) {
            first = pairs[2][0];
        } else if (pairs[1][0] == pairs[2][0]) {
            first = pairs[0][0];
        } else {
            first = pairs[1][0];
        }

        if (pairs[0][1] == pairs[1][1]) {
            second = pairs[2][1];
        } else if (pairs[1][1] == pairs[2][1]) {
            second = pairs[0][1];
        } else {
            second = pairs[1][1];
        }

        System.out.print(first + " " + second);

    }
}