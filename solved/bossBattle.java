package solved;

import utils.FastReader;

public class bossBattle {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        

        if(n > 3) {
            System.out.println(n - 2);
        }else{
            System.out.println(1);
        }

    }
}
