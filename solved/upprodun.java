package solved;
import java.util.Scanner;

public class upprodun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int m = in.nextInt();

        in.close();

        int num = m / n;

        int rem = m % n;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            if(rem > 0) System.out.print("*"); rem--;
            System.out.println();
        }
    }
}