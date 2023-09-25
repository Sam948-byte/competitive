package notSolved;

import java.util.ArrayList;
import java.util.List;
import utils.FastReader;

public class froggereasy {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int s = in.nextInt();

        int m = in.nextInt();

        int[] squares = new int[n];

        int count = 0;

        List<Integer> previous = new ArrayList<Integer>();

        String output;

        for (int i = 0; i < n; i++) {
            squares[i] = in.nextInt();
        }

        

        while (true) {
            if (s < 0) {
                System.out.println("left");
                break;
            } else if (s > n - 1) {
                System.out.println("right");
                break;
            } else if (squares[s] == m) {
                System.out.println("magic");
                break;
            } else if (previous.contains(s)) {
                System.out.println("cycle");
                break;
            }

            previous.add(s);

            s += squares[s];

            count++;
        }
        System.out.print(count);
    }
}

// 8 4 7
// 7 5 4 2 -13 -2 -3 6
