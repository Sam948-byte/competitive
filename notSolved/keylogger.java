package notSolved;

import java.util.Scanner;

public class keylogger {
    static Object[][] noises = { { "clank", "bong", "click", "tap", "poing", "clonk", "clack", "ping",
            "tip", "cloing", "tic",
            "cling", "bing", "pong", "clang", "pang", "clong", "tac", "boing", "boink", "cloink", "rattle", "clock",
            "toc", "clink", "tuc" },
            { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                    90} };

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean shifted = false;
        String print = new String();
        int number = 0;

        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            String sound = in.nextLine();

            if (sound.equals("whack")) {
                print += " ";
                continue;
            }

            if (sound.equals("pop")) {
                print = print.substring(0, print.length() - 1);
                continue;
            }

            if (sound.equals("bump") || sound.equals("dink") || sound.equals("thumb")) {
                shifted = !shifted;
                continue;
            }

            for (int j = 0; j < noises[0].length; j++) {
            if (sound.equals(noises[0][j])) {
            number = (int) noises[1][j];
            break;
            }
            }

            // int indexOf = Arrays.asList(noises[0]).indexOf(sound);

            // number = (int) noises[1][indexOf];

            if (!shifted) {
                print += (char) (number + 32);
            } else {
                print += (char) number;
            }
        }

        in.close();

        System.out.print(print);
    }
}