import java.util.Scanner;

public class locustLocus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] locusts = new int[n][3];

        int reappear;

        int answer = 0;

        boolean repeat = true;

        // gets data and puts it in array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                locusts[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int potentialAnswer = locusts[i][0] + lcm(locusts[i][1], locusts[i][2]);

            if (potentialAnswer < answer || answer == 0) {
                answer = potentialAnswer;
            }

        }

        System.out.print(answer);
    }

    public static int lcm(int n1, int n2) {
        int lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            ++lcm;
        }

        return lcm;
    }
}