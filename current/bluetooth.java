package current;

import java.util.Scanner;
import java.util.Arrays;

public class bluetooth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int problem = 0;

        // top left, bottom left, top right, bottom right
        int[][][] teeth = { { { 0, 0, 0, 0, 0, 0, 0, 0}, { 0, 0, 0, 0, 0, 0, 0, 0} },
                { { 0, 0, 0, 0, 0, 0, 0, 0}, { 0, 0, 0, 0, 0, 0, 0, 0} } };

        for (int i = 0; i < n; i++) {
            String tooth = in.next();
            if (in.next().charAt(0) == 'm') {
                problem = 1;
            } else{
                problem = 2;
            }

            // System.out.print(Math.abs(tooth.charAt(1)) - 48);

            if (tooth.charAt(0) == '+') {
                teeth[0][0][Math.abs(tooth.charAt(1)) - 49] = problem;
            } else if (tooth.charAt(1) == '+') {
                teeth[1][0][Math.abs(tooth.charAt(0)) - 49] = problem;
            } else if (tooth.charAt(0) == '-') {
                teeth[0][1][Math.abs(tooth.charAt(1)) - 49] = problem;
            } else if (tooth.charAt(1) == '-') {
                teeth[1][1][Math.abs(tooth.charAt(0)) - 49] = problem;
            }
        }

        in.close();

      
        

        if ((contains(teeth[0][0], 2) || contains(teeth[0][1], 2) ||
                !contains(teeth[0][0], 0) || !contains(teeth[0][1], 0)) &&
                (contains(teeth[1][0], 2) || !contains(teeth[1][0], 0) ||
                        contains(teeth[1][1], 2) || !contains(teeth[1][1], 0))) {
            System.out.print(2);
        } else if (contains(teeth[0][1], 0) && contains(teeth[0][0], 0) && !contains(teeth[0][1], 2)
                && !contains(teeth[0][0], 2)) {
            System.out.print(0);
        } else if (contains(teeth[1][1], 0) && contains(teeth[1][0], 0) && !contains(teeth[1][1], 2)
                && !contains(teeth[1][0], 2)) {
            System.out.print(0);
        }

    }

    public static boolean contains(int[] array, int key) {
        return Arrays.asList(array).contains(key);
    }

}
