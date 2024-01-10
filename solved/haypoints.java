import java.util.HashMap;

import utils.FastReader;

public class haypoints {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int m = in.nextInt();

        int n = in.nextInt();

        HashMap<String, Integer> points = new HashMap<>();

        for (int i = 0; i < m; i++) {
            points.put(in.next(), in.nextInt());
        }

        String line;

        int worth = 0;
        Integer value;

        for (int i = 0; i < n; i++) {
            while (!(line = in.next()).equals(".")) {
                if((value = points.get(line)) != null){
                    worth += value;
                }
            }
            System.out.println(worth);
            worth = 0;
        }

    }

}