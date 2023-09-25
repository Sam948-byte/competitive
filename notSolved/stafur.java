package notSolved;

import utils.FastReader;

public class stafur {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String check = in.next();

        char letter = check.charAt(0);

        

        if (letter <= 90 && letter >= 65) {
            if (letter == 65 || letter == 69 || letter == 73 ||
                    letter == 79 || letter == 85) {
                System.out.print("Jebb");
            } else if(letter == 89){
                System.out.print("Jebb\nNeibb");
            }
            else {
                System.out.print("Neibb");
            }
        } else {
            System.out.print("Kannski");
        }
    }
}