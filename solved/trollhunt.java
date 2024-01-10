import java.util.Scanner;

public class trollhunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bridges = in.nextInt() - 1;

        int knights = in.nextInt();

        int groupSize = in.nextInt();

        in.close();

        double groups = (int) (knights/groupSize);

        double days = Math.ceil(bridges/groups);

        System.out.println((int) days);
    }
}
