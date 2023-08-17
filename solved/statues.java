package solved;
import java.util.Scanner;

public class statues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int printers = 1;

        int days = 0;

        while(printers < n) {
            printers *= 2;
            days++;
        }

        System.out.println(days + 1);
    }
}
