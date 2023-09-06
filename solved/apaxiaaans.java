package solved;
import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        in.close();

        String output = input.substring(0, 1);

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) != output.charAt(output.length() - 1)){
                output += input.charAt(i);
            }
            
        }

        System.out.print(output);
    }
}
