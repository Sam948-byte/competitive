import java.util.Scanner;

public class trollhunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bridges = in.nextInt();

        int knights = in.nextInt();

        int groupSize = in.nextInt();

        int groups = (int) (knights/groupSize);

        int days = (int) (bridges/groups);

        System.out.println(days);
    }
}
