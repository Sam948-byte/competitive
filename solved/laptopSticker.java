package solved;

import utils.FastReader;

public class laptopSticker {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int wc = in.nextInt();
        int hc = in.nextInt();
        int ws = in.nextInt();
        int hs = in.nextInt();

        

        if(wc - ws >= 2) {
            if (hc - hs >= 2) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else{
            System.out.println(0);
        }

    }
}
