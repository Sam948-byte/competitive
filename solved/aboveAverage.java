package solved;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setMinimumFractionDigits(3);
        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = in.nextInt();

            int total = 0;
            int count = 0;
            int[] scores = new int[n];

            for (int j = 0; j < n; j++) {
                scores[j] = in.nextInt();
                total += scores[j];
            }
            double average = (double) total / n;

            for (int k = 0; k < n; k++) {
                if (scores[k] > average) {
                    count++;
                }
            }

            System.out.println(df.format((double)count / n * 100) + "%");
        }
    }
}
