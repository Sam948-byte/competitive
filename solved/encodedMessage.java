package solved;

import java.util.Scanner;

public class encodedMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] messages = new String[n];

        for (int i = 0; i < n; i++) {
            messages[i] = in.next();
        }

        in.close();

        for (int i = 0; i < n; i++) {
            int squareSize = (int) Math.sqrt(messages[i].length());
            char[][] rotater = new char[squareSize][squareSize];
            for (int j = 0; j < squareSize; j++) {
                for (int k = 0; k < squareSize; k++) {
                    rotater[j][k] = messages[i].charAt(j * squareSize + k);
                }
            }

            // rotate code
            rotateMatrix(squareSize, rotater);

            for (int j = 0; j < squareSize; j++) {
                for (int k = 0; k < squareSize; k++) {
                    System.out.print(rotater[j][k]);
                }
            }

            System.out.print("\n");
        }

    }

    static void rotateMatrix(int N, char mat[][]) { // REVERSE every row
        for (int i = 0; i < N; i++)
            Reverse(i, mat, N);

        // Performing Transpose
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                char temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    static void Reverse(int i, char mat[][], int N) {
        // Initialise start and end index
        int start = 0;
        int end = N - 1;

        // Till start < end, swap the element
        // at start and end index
        while (start < end) {

            // Swap the element
            char temp = mat[i][start];
            mat[i][start] = mat[i][end];
            mat[i][end] = temp;

            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
        }
    }
}
