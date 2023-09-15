package solved;
import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}