package solved;

import utils.FastReader;

public class cold {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            if(in.nextInt() < 0){
                count++;
            }
        }

        System.out.print(count);
    }
}
