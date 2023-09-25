package notSolved;


import java.util.Arrays;
import java.util.Collections;
import utils.FastReader;

public class aFuriousCocktail {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        boolean works = true;
        int n = in.nextInt();
        int t = in.nextInt();

        

        Integer[] durations = new Integer[n];

        for (int i = 0; i < n; i++) {
            durations[i] = in.nextInt();
        }

        Arrays.sort(durations, Collections.reverseOrder());

        for (int i = 0; i < n - 2; i++) {
            if (durations[i] - durations[i + 1] < t) {
                // System.out.println(i);
                works = false;
                break;
            }
        }

        if (works) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
