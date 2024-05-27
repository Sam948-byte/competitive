import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class sverigekartan {

    private static boolean[][] visited;
    private static int x;
    private static int y;

    public static void main(String[] args) {
        // Stockholm is 2, land is 1, water is 0
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        int u = in.nextInt();

        visited = new boolean[r][c];

        // burn the line
        in.nextLine();

        ArrayList<ArrayList<Integer>> map = new ArrayList<>(r);

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> row = new ArrayList<>(c);
            String nextRow = in.nextLine();
            for (Character character : nextRow.toCharArray()) {
                if (character == '.') {
                    row.add(0);
                } else if (character == '#') {
                    row.add(1);
                } else if (character == 'S') {
                    x = i;
                    y = row.size();
                    row.add(2);
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            map.add(row);
        }

        LinkedList<Integer[]> pairs = new LinkedList<>();

        for (int i = 0; i < u; i++) {
            Integer[] pair = new Integer[] { in.nextInt() - 1, in.nextInt() - 1 };
            pairs.add(pair);
        }

        System.out.println(countEm(map, x, y));
        // printOut(map);

        for (int i = 0; i < u; i++) {
            Integer[] pair = pairs.get(i);

            map.get(pair[0]).set(pair[1], 1);
            visited = new boolean[r][c];
            System.out.println(countEm(map, x, y));
            // printOut(map);
        }
    }

    private static int countEm(ArrayList<ArrayList<Integer>> map, int r, int c) {
        if (r < 0 || r >= map.size() || c < 0 || c >= map.get(0).size() || map.get(r).get(c) == 0 || visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;

        return countEm(map, r + 1, c) + countEm(map, r - 1, c) + countEm(map, r, c + 1) + countEm(map, r, c - 1) + 1;
    }

//     private static int countEm(ArrayList<ArrayList<Integer>> map, int r, int c) {
//     int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//     Stack<int[]> stack = new Stack<>();
//     stack.push(new int[]{r, c});
//     int count = 0;

//     while (!stack.isEmpty()) {
//         int[] cell = stack.pop();
//         r = cell[0];
//         c = cell[1];

//         if (r < 0 || r >= map.size() || c < 0 || c >= map.get(0).size() || map.get(r).get(c) == 0 || visited[r][c]) {
//             continue;
//         }

//         visited[r][c] = true;
//         count++;

//         for (int[] direction : directions) {
//             stack.push(new int[]{r + direction[0], c + direction[1]});
//         }
//     }

//     return count;
// }

    private static void printOut(ArrayList<ArrayList<Integer>> map) {
        for (ArrayList<Integer> list : map) {
            System.out.println(list);
        }
    }
}
