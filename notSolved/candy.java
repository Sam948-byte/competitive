package notSolved;

import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int f = in.nextInt();

        long t = in.nextLong();

        long[] candy = new long[n];

        for(int i = 0; i < n; i++){
            candy[i] = in.nextLong();
        }

        in.close();


    }
}
