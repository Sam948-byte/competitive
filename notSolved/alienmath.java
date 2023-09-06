package current;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alienmath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();

        List<String> numbers = new ArrayList<String>();

        for (int i = 0; i < base; i++) {
            numbers.add(in.next());
        }

        String input = in.next();

        in.close();

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
