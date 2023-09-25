package solved;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class keylogger {

    static int index;

    static ArrayList<String> noises = new ArrayList<>(
            Arrays.asList("clank", "bong", "click", "tap", "poing", "clonk", "clack", "ping", "tip", "cloing", "tic",
                    "cling", "bing", "pong", "clang", "pang", "clong", "tac", "boing", "boink", "cloink", "rattle",
                    "clock", "toc", "clink", "tuc"));

    static ArrayList<Character> alphabet = new ArrayList<>(
            Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String args[]) {
        // Scanner in = new Scanner(System.in);
        FastReader in = new FastReader();
        boolean shifted = false;
        StringBuilder print = new StringBuilder();
        int number = 0;

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String sound = in.nextLine();

            if (sound.equals("whack")) {
                print.append(" ");
                continue;
            } else if (sound.equals("pop") && print.length() != 0) {
                // if (print.length() != 0) {
                print = print.deleteCharAt(print.length() - 1);
                // }
                continue;
            } else if (sound.equals("bump") || sound.equals("dink") || sound.equals("thumb")) {
                shifted = !shifted;
                continue;
            } else {
                index = noises.indexOf(sound);
            }

            print.append((index == -1) ? "" : (char) (alphabet.get(index) - 32));
        }

        System.out.print(print);
    }
}