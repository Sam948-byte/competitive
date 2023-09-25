package notSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class keylogger {

    int index;

    static ArrayList<String> noises = new ArrayList<>(
            Arrays.asList("clank", "bong", "click", "tap", "poing", "clonk", "clack", "ping", "tip", "cloing", "tic",
                    "cling", "bing", "pong", "clang", "pang", "clong", "tac", "boing", "boink", "cloink", "rattle",
                    "clock", "toc", "clink", "tuc"));

    // static ArrayList<Integer> ascii = new ArrayList<>(Arrays.asList(65, 66, 67,
    // 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
    // 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90));

    static ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean shifted = false;
        String print = new String();
        int number = 0;

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String sound = in.nextLine();

            if (sound.equals("whack")) {
                print += " ";
                continue;
            } else if

            (sound.equals("pop")) {
                print = print.substring(0, print.length() - 1);
                continue;
            } else

            if (sound.equals("bump") || sound.equals("dink") || sound.equals("thumb")) {
                shifted = !shifted;
                continue;
            } else {

                index = noises.indexOf(sound);
                
                // number = ascii.get(index);
            }

            // print += (shifted) ? (char) (number) : (char) (number + 32);
            print += alphabet.get(index);
        }

        in.close();

        System.out.print(print);
    }
}