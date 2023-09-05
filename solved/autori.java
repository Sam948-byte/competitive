package solved;

import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        in.close();

        String output = "";

        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                output += input.charAt(i);
            }
        }

        System.out.print(output);
    }
}
