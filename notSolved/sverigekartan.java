import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class sverigekartan {
    public static void main(String[] args) {
        // Stockholm is 2, land is 1, water is 0
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        int u = in.nextInt();

        ArrayList<ArrayList<Integer>> map = new ArrayList<>(r);

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> row = new ArrayList<>(c);
            String nextRow = in.nextLine();
            for (Character character : nextRow.toCharArray()) {
                row.add(
                        switch (character) {
                            case '.' -> 0;
                            case '#' -> 1;
                            case 'S' -> 2;
                            default -> throw new UnsupportedOperationException();
                        });
            }
            map.add(row);
        }

        LinkedList<Integer[]> pairs = new LinkedList<>();

        for (int i = 0; i < u; i++) {
            Integer[] pair = new Integer[] { in.nextInt() - 1, in.nextInt() - 1 };
            pairs.add(pair);
        }

        // System.out.println(countEm(map));
        printOut(map);

        for (int i = 0; i < u; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            map.get(x).set(y, 1);
            // System.out.println(countEm(map));
            printOut(map);
        }

        in.close();
    }

    private static int countEm(ArrayList<ArrayList<Integer>> map) {
        return 0;
    }

    private static void printOut(ArrayList<ArrayList<Integer>> map) {
        for (ArrayList<Integer> list : map) {
            System.out.println(list);
        }
    }
}
