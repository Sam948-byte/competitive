package notSolved;

import java.util.ArrayList;
import java.util.Arrays;
import utils.FastReader;

public class inflation2 {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        ArrayList<Integer> prices = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            prices.add(in.nextInt());
        }

        int q = in.nextInt();

        char[] which = new char[q];

        int[] inflation = new int[q];

        int[][] set = new int[q][2];

        for (int i = 0; i < q; i++) {
            String adjust = in.next();
            if (adjust.equals("INFLATION")) {
                which[i] = 'i';
                inflation[i] = in.nextInt();
            } else if (adjust.equals("SET")) {
                which[i] = 's';
                set[i] = new int[] { in.nextInt(), in.nextInt() };
            }
        }

        

        for (int i = 0; i < q; i++) {
            if (which[i] == 'i') {
                for (int j = 0; j < prices.size(); j++) {
                    prices.set(j, prices.get(j) + inflation[i]);
                }
            } else {
                // for (int j = 0; j < prices.length; j++) {
                //     if (prices[j] == set[i][0]) {
                //         prices[j] = set[i][1];
                //     }
                // }

                    Arrays.asList(prices);
                    int index;
                while(true){

                }
            }
            System.out.println(sumAll(prices));
        }
    }

    public static long sumAll(ArrayList<Integer> arr) {
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
