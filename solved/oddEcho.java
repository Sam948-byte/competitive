package solved;

import java.util.Scanner;

public class oddEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = in.next();
        }

        in.close();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(input[i]);
            }
        }
    }
}
