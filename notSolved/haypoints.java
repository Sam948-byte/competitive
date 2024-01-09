
import java.util.ArrayList;

import utils.FastReader;

public class haypoints {
    public static void main(String[] args) {
        FastReader in = new FastReader();

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

    }

}