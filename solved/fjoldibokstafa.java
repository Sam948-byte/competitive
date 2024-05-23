import java.util.Scanner;

public class fjoldibokstafa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int counter = 0;

        for(Character c : input.toCharArray()){
            if((c > 64 && c < 91) || (c > 96 && c < 123)){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
