package solved;
import utils.FastReader;

public class apaxiaaans {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String input = in.next();

        

        String output = input.substring(0, 1);

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) != output.charAt(output.length() - 1)){
                output += input.charAt(i);
            }
            
        }

        System.out.print(output);
    }
}
