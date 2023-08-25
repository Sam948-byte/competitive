package solved;
import java.util.Scanner;

public class okviri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int length = input.length();

        in.close();

        topAndBottom(length);
        middles(length);
        letter(length, input);
        middles(length);
        topAndBottom(length);

    }

    public static void topAndBottom(int length) {
        System.out.print(".");
        for (int i = 0; i < length; i++) {
            System.out.print(".");
            if ((i + 1) % 3 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
            System.out.print("..");
        }
        System.out.print("\n");
    }

    public static void middles(int length) {
        System.out.print(".");
        for (int i = 0; i < length * 2; i++) {
            if ((i % 6 + 1) % 5 == 0 || (i % 6+ 1) % 6 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
            System.out.print(".");
        }
        System.out.print("\n");
    }

    public static void letter(int length, String input) {
        System.out.print("#");
        for (int i = 0; i < length; i++) {
            System.out.print("." + input.charAt(i) + ".");

            if ((i + 1) % 3 == 0 || (i + 1 < length && (i + 1) % 3 == 2)) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
        }
        System.out.print("\n");
    }
}
