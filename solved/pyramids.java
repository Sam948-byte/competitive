package solved;
import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int layers = 0;

        for(int i = 1; n >= Math.pow(i, 2); i+=0){
            n -= Math.pow(i, 2);
            layers++;
            i+=2;
        }

        System.out.print(layers);
    }
}
