package notSolved;

import java.util.ArrayList;
import java.util.List;
import utils.FastReader;

public class alienmath {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int base = in.nextInt();

        List<String> numbers = new ArrayList<String>();

        for (int i = 0; i < base; i++) {
            numbers.add(in.next());
        }

        String input = in.next();

        

        int output = 0;

        


      
        
        

        

    }

    //remove the digit from the string
    public static String removeFirst(String str) {

        // Removing first and last character
        // of a string using substring() method
        str = str.substring(str.length(), str.length());

        // Return the modified string
        return str;
    }
}
