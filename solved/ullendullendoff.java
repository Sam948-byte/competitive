package solved;

import java.util.Scanner;

public class ullendullendoff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int picked = -1;

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = in.next();
        }

        in.close();

       for(int i = 0; i < 13; i++){
        picked++;

        if(picked >= names.length){
            picked = 0;
        }
       }

        System.out.print(names[picked]);
    }
}
