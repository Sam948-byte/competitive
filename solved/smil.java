package solved;
import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        in.close();

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == ':' || input.charAt(i) == ';' ) && 
            (i < input.length() - 1 && input.charAt(i + 1) == ')' || 
            i < input.length() - 2 && input.charAt(i + 1) == '-' && input.charAt(i + 2) == ')')) {
                    System.out.println(i);
                
            }
        }
    }
}
