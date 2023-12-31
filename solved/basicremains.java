package solved;

import java.math.BigInteger;
import java.util.ArrayList;
import utils.FastReader;

public class basicremains {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int base;

        ArrayList<Long> answers = new ArrayList<Long>();

        while((base = in.nextInt()) != 0){

            String p = in.next();

            String m = in.next();

            BigInteger pConverted = new BigInteger(convertBase(10, base, p));
            BigInteger mConverted = new BigInteger(convertBase(10, base, m));

            BigInteger calc = pConverted.remainder(mConverted);

            answers.add(Long.parseLong(convertBase(base, 10, calc.toString())));
            
        }

        

        for(int i = 0; i < answers.size(); i++){
            System.out.println(answers.get(i));
        }
    }

    public static String convertBase(int targetBase, int startBase, String number){
        BigInteger input = new BigInteger(number, startBase);
        return input.toString(targetBase);
    }
}
