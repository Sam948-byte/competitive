package current;

import java.util.ArrayList;
import java.util.Scanner;

public class haypoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        int n = in.nextInt();

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();

        String input = "";

        String[][] descriptions = new String[n][];

        for (int i = 0; i < m; i++) {
            words.add(in.next());
            values.add(in.nextInt());
        }

        String line;

        int[] worth = new int[n];

        for (int i = 0; i < n; i++) {
            while (!(line = in.next()).equals(".")) {

                int index = words.indexOf(line);
                if (index != -1) {
                    worth[i] += values.get(index);
                }
            }
        }

        in.close();

        for(int i = 0; i < n; i++){
            System.out.println(worth[i]);
        }

    }
}