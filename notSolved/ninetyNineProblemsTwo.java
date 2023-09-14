package notSolved;

import java.util.Arrays;
import java.util.Scanner;

public class ninetyNineProblemsTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int q = in.nextInt();

        int[] difficulties = new int[n];

        boolean[] which = new boolean[q];

        int[] level = new int[q];

        for (int i = 0; i < n; i++) {
            difficulties[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            if ((in.nextInt()) == 1) {
                which[i] = true;
            } else {
                which[i] = false;
            }

            level[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(difficulties);

        int[] offset = { 1, 0 };

        for (int i = 0; i < q; i++) {
            if (which[i]) {
                if (difficulties[difficulties.length - offset[0]] > level[i]) {
                    System.out.println(difficulties[difficulties.length - offset[0]]);
                    offset[0]++;
                } else {
                    System.out.println(-1);
                }
            } else {
                if (difficulties[difficulties.length + offset[1] - 1] > level[i]) {
                    System.out.println(difficulties[difficulties.length + offset[1] - 1]);
                    offset[1]++;
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}