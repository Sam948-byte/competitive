package solved;

import utils.FastReader;

public class turnItUp {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int volume = 7;

        for (int i = 0; i < n * 2; i++) {
            String order = in.next();
            if (order.equals("op!")) {
                volume++;
            } else if (order.equals("ned!")) {
                volume--;
            }
            if (volume > 10) {
                volume = 10;
            } else if (volume < 0) {
                volume = 0;
            }
        }

        

        System.out.print(volume);
    }
}
