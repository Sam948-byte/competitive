package solved;

import java.util.Arrays;
import java.util.Scanner;

public class songbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int time = in.nextInt() * 60;

        int songs = in.nextInt();

        int singingTime = 0;

        int singingTimePrior = 0;

        int[] durations = new int[songs];

        for (int i = 0; i < songs; i++) {
            durations[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(durations);

        for (int i = 0; i < songs; i++) {
            singingTime += durations[i];

            if (singingTime > time) {
                break;
            } else{
                singingTimePrior = singingTime;
            }
        }

        System.out.print(singingTimePrior);
    }
}