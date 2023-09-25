package solved;

import utils.FastReader;

public class oddEcho {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = in.next();
        }

        

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(input[i]);
            }
        }
    }
}
