package notSolved;
//TODO
import java.util.Scanner;

public class houseBuilding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int height = in.nextInt();

        int width = in.nextInt();

        int people = in.nextInt();

        int[][] happiness = new int[height][width];

        switch (t) {
            case 1:
                one(height, width, people, happiness);
                break;
            case 2:
                two(height, width, people, happiness);
                break;
            case 3:
                three(height, width, people, happiness);
                break;
            case 4:
                four(height, width, people, happiness);
                break;
            case 5:
                five(height, width, people, happiness);
                break;
            case 6:
                six(height, width, people, happiness);
                break;
            case 7:
                seven(height, width, people, happiness);
                break;
            case 8:
                eight(height, width, people, happiness);
                break;
            case 9:
                nine(height, width, people, happiness);
                break;
            case 10:
                ten(height, width, people, happiness);
                break;

        }
    }

    public static void one(int height, int width, int people, int[][] happiness) {

    }

    public static void two(int height, int width, int people, int[][] happiness) {

    }

    public static void three(int height, int width, int people, int[][] happiness) {

    }

    public static void four(int height, int width, int people, int[][] happiness) {

    }

    public static void five(int height, int width, int people, int[][] happiness) {

    }

    public static void six(int height, int width, int people, int[][] happiness) {

    }

    public static void seven(int height, int width, int people, int[][] happiness) {

    }

    public static void eight(int height, int width, int people, int[][] happiness) {

    }

    public static void nine(int height, int width, int people, int[][] happiness) {

    }

    public static void ten(int height, int width, int people, int[][] happiness) {

    }
}
