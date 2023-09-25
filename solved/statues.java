package solved;
import utils.FastReader;

public class statues {
    public static void main(String[] args) {
        FastReader in = new FastReader();

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
