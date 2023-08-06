import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String able = in.nextLine();
        String doctor = in.nextLine();

        if (able.length() >= doctor.length()) {
            System.out.print("go");
        } else {
            System.out.print("no");
        }
    }
}
