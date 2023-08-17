package notSolved;

import java.util.Scanner;

public class keylogger {
    static Object[][] noises = { { "clank", 65 }, { "bong", 66 }, { "click", 67 }, { "tap", 68 }, { "poing", 69 },
            { "clonk", 70 }, { "clack", 71 }, { "ping", 72 }, { "tip", 73 }, { "cloing", 74 }, { "tic", 75 },
            { "cling", 76 }, { "bing", 77 }, { "pong", 78 }, { "clang", 79 }, { "pang", 80 }, { "clong", 81 },
            { "tac", 82 }, { "boing", 83 }, { "boink", 84 }, { "cloink", 85 }, { "rattle", 86 }, { "clock", 87 },
            { "toc", 88 }, { "clink", 89 }, { "tuc", 90 } };

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

            for (int j = 0; j < noises.length; j++) {
                if (sound.equals(noises[j][0])) {
                    number = (int) noises[j][1];
                    break;
                }
            }

            if (!shifted) {
                print += (char) (number + 32);
            } else {
                print += (char) number;
            }
        }

        System.out.print(print);
    }
}

// 27
// clank
// bong
// click
// tap
// poing
// clonk
// clack
// ping
// tip
// cloing
// tic
// cling
// bing
// pong
// clang
// pang
// clong
// tac
// boing
// boink
// cloink
// rattle
// clock
// toc
// clink
// tuc
// pop