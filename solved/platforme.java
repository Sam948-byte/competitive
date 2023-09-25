package solved;

import java.util.Arrays;
import utils.FastReader;

public class platforme {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int[][] platforms = new int[n][3];

        for (int i = 0; i < n; i++) {
            platforms[i][0] = in.nextInt();
            platforms[i][1] = in.nextInt();
            platforms[i][2] = in.nextInt();
        }

        

        int maxHeight = findMax(platforms, 0);
        int maxLength = findMax(platforms, 2);

        int[][] grid = new int[maxHeight + 1][maxLength];

        for (int i = 0; i < n; i++) {
            for (int j = platforms[i][1]; j < platforms[i][2]; j++) {
                grid[platforms[i][0]][j] = 1;
            }
        }

        int pillars = 0;

        for (int i = 0; i < n; i++) {

            for (int j = platforms[i][0]; j > 0; j--) {
                pillars++;
                if (grid[j][platforms[i][1]] == 1 && j != platforms[i][0]) {
                    pillars--;
                    break;
                }
            }

            for (int j = platforms[i][0]; j > 0; j--) {
                pillars++;
                if (grid[j][platforms[i][2] - 1] == 1 && j != platforms[i][0]) {
                    pillars--;
                    break;
                }
            }
        }

        System.out.print(pillars);
    }

    // find maximum number in two-dimensional array assuming all positive comparing
    // columns
    public static int findMax(int[][] arr, int place) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][place] > max) {
                max = arr[i][place];
            }
        }

        return max;
    }
}
