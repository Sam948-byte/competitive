package solved;

import java.util.Scanner;

public class bannord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String forbidden = in.nextLine();

        String memo = in.nextLine();

        in.close();

        String[] words = memo.split(" ");

        String[] forbiddens = forbidden.split("(?!^)");

        boolean forbid = false;

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < forbiddens.length; j++) {

                if (words[i].contains(forbiddens[j])) {
                    forbid = true;
                    break;
                }

            }
            if (forbid) {
                for (int k = 0; k < words[i].length(); k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print(words[i]);
            }

            System.out.print(" ");

            forbid = false;
        }
    }
}
