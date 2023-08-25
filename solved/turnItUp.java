package solved;

import java.util.Scanner;

public class turnItUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        in.close();

        System.out.print(volume);
    }
}
