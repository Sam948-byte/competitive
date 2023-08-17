package notSolved;


import java.util.Scanner;

public class twentyFortyEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int direction = in.nextInt();

        if (direction == 0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j < 3 && array[i][j] == 0 && array[i][j + 1] != 0) {
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = 0;
                    } else if (j < 2 && array[i][j] == 0 && array[i][j + 2] != 0) {
                        array[i][j] = array[i][j + 2];
                        array[i][j + 2] = 0;
                    } else if (j < 1 && array[i][j] == 0 && array[i][j + 3] != 0) {
                        array[i][j] = array[i][j + 3];
                        array[i][j + 3] = 0;
                    }

                    if (j < 3 && array[i][j] == array[i][j + 1]) {
                        array[i][j] *= 2;
                        array[i][j + 1] = 0;
                    } else if (j < 2 && array[i][j + 1] == 0 && array[i][j] == array[i][j + 2]) {

                        array[i][j] *= 2;
                        array[i][j + 2] = 0;

                    } else if (j < 1 && array[i][j + 2] == 0 && array[i][j] == array[i][j + 3]) {

                        array[i][j] *= 2;
                        array[i][j + 3] = 0;

                    }

                }
            }
        } else if (direction == 1) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 4; i++) {
                    if (i < 3 && array[i][j] == 0 && array[i + 1][j] != 0) {
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = 0;
                    } else if (i < 2 && array[i][j] == 0 && array[i + 2][j] != 0) {
                        array[i][j] = array[i + 2][j];
                        array[i + 2][j] = 0;
                    } else if (i < 1 && array[i][j] == 0 && array[i + 3][j] != 0) {
                        array[i][j] = array[i + 3][j];
                        array[i + 3][j] = 0;
                    }

                    if (i < 3 && array[i][j] == array[i + 1][j]) {
                        array[i][j] *= 2;
                        array[i + 1][j] = 0;
                    } else if (i < 2 && array[i + 1][j] == 0 && array[i][j] == array[i + 2][j]) {

                        array[i][j] *= 2;
                        array[i + 2][j] = 0;

                    } else if (i < 1 && array[i + 2][j] == 0 && array[i][j] == array[i + 3][j]) {

                        array[i][j] *= 2;
                        array[i + 3][j] = 0;

                    }

                }
            }
        } else if (direction == 2) {
            for (int i = 3; i >= 0; i--) {
                for (int j = 3; j >= 0; j--) {
                    // System.out.println(i + "," + j);
                    if (j > 0 && array[i][j] == 0 && array[i][j - 1] != 0) {
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = 0;
                    } else if (j > 1 && array[i][j] == 0 && array[i][j - 2] != 0) {
                        array[i][j] = array[i][j - 2];
                        array[i][j - 2] = 0;
                    } else if (j > 2 && array[i][j] == 0 && array[i][j - 3] != 0) {
                        array[i][j] = array[i][j - 3];
                        array[i][j - 3] = 0;
                    }

                    if (j > 0 && array[i][j] == array[i][j - 1]) {
                        array[i][j] *= 2;
                        array[i][j - 1] = 0;
                    } else if (j > 1 && array[i][j - 1] == 0 && array[i][j] == array[i][j - 2]) {

                        array[i][j] *= 2;
                        array[i][j - 2] = 0;

                    } else if (j > 2 && array[i][j - 2] == 0 && array[i][j] == array[i][j - 3]) {

                        array[i][j] *= 2;
                        array[i][j - 3] = 0;

                    }

                }
            }
        } else if (direction == 3) {
            for (int j = 3; j >= 0; j--) {
                for (int i = 3; i >= 0; i--) {
                    // System.out.println(i + "," + j);
                    if (i > 0 && array[i][j] == 0 && array[i - 1][j] != 0) {
                        array[i][j] = array[i - 1][j];
                        array[i - 1][j] = 0;
                    } else if (i > 1 && array[i][j] == 0 && array[i - 2][j] != 0) {
                        array[i][j] = array[i - 2][j];
                        array[i - 2][j] = 0;
                    } else if (i > 2 && array[i][j] == 0 && array[i - 3][j] != 0) {
                        array[i][j] = array[i - 3][j];
                        array[i - 3][j] = 0;
                    }

                    if (i > 0 && array[i][j] == array[i - 1][j]) {
                        array[i][j] *= 2;
                        array[i - 1][j] = 0;
                    } else if (i > 1 && array[i - 1][j] == 0 && array[i][j] == array[i - 2][j]) {

                        array[i][j] *= 2;
                        array[i - 2][j] = 0;

                    } else if (i > 2 && array[i - 2][j] == 0 && array[i][j] == array[i - 3][j]) {

                        array[i][j] *= 2;
                        array[i - 3][j] = 0;

                    }

                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}