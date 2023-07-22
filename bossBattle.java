
import java.util.Scanner;

public class bossBattle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n > 3) {
            System.out.println(n - 2);
        }else{
            System.out.println(1);
        }

    }
}
