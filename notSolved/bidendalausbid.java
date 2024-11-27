import java.util.Scanner;

public class bidendalausbid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String first = in.nextLine();
        String[] firstArr = first.split(":");
        int firstTime = Integer.parseInt(firstArr[0]) * 60 + Integer.parseInt(firstArr[1]);

        String second = in.nextLine();
        String[] secondArr = second.split(":");
        int secondTime = Integer.parseInt(secondArr[0]) * 60 + Integer.parseInt(secondArr[1]);

        in.close();
    }
}
