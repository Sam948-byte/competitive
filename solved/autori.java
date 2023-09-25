package solved;

import utils.FastReader;

public class autori {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String input = in.next();

        

        String output = "";

        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                output += input.charAt(i);
            }
        }

        System.out.print(output);
    }
}
