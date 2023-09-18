package notSolved;

import java.util.ArrayList;
import java.util.Scanner;

public class haypoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        int n = in.nextInt();

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            words.add(in.next());
            values.add(in.nextInt());
        }

        String line;

        int worth = 0;

        for (int i = 0; i < n; i++) {
            while (!(line = in.next()).equals(".")) {

                int index = words.indexOf(line);
                if (index != -1) {
                    worth += values.get(index);
                }
            }
            System.out.println(worth);
            worth = 0;
        }

        in.close();

        

    }
}