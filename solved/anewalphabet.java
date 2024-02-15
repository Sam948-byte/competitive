import java.util.Scanner;

public class anewalphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] alphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
        String input = in.nextLine();
        in.close();
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                output += alphabet[c - 'a'];
            } else {
                output += c;
            }
        }
        System.out.println(output);
    }
}