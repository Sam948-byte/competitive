package solved;

import java.util.Scanner;

public class laptopSticker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int wc = in.nextInt();
        int hc = in.nextInt();
        int ws = in.nextInt();
        int hs = in.nextInt();
//System.out.println(wc + "" + hc + "" + ws + "" + hs);

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
