package solved;

import java.util.Scanner;

public class findingana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        in.close();
        
        boolean found = false;

        for(int i = 0; i < input.length(); i++){
            char charAt = input.charAt(i);
            if(charAt == 'a'){
                found = true;
            }
            if(found){
                System.out.print(charAt);
            }
        }
    }
}
