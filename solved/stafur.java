
import java.util.Scanner;

public class stafur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String check = in.next();

        char letter = check.charAt(0);

        in.close();

        if (letter == 65 || letter == 69 || letter == 73 ||
                    letter == 79 || letter == 85) {
                System.out.print("Jebb");
            } else if(letter == 89){
                System.out.print("Kannski");
            }
            else {
                System.out.print("Neibb");
            }
        }
    }
}
