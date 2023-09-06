package solved;
import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] cases = new int[n];

        for (int i = 0; i < n; i++) {
            cases[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < n; i++) {
            if (cases[i] % 2 == 0) {
                System.out.println(cases[i] + " is even");
            } else {
                System.out.println(cases[i] + " is odd");
            }
        }
    }
}