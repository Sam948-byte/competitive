package solved;

import utils.FastReader;

public class findingana {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String input = in.next();

        
        
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
