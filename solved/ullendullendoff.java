package solved;

import utils.FastReader;

public class ullendullendoff {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int picked = -1;

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = in.next();
        }

        

       for(int i = 0; i < 13; i++){
        picked++;

        if(picked >= names.length){
            picked = 0;
        }
       }

        System.out.print(names[picked]);
    }
}
