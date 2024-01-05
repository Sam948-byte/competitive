

import java.util.Scanner;

public class ninetynine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;

        System.out.println(1);

        while(true){
            i = in.nextInt();
            if(i < 96) System.out.println((i % 2 == 0) ? i + 2 : i + 1);
            if(i == 97){
                System.out.println(i + 2);
                break;
            }
            if(i == 98){
                System.out.println(i + 1);
                break;
            }
            if(i == 99){
                break;
            }
        }

        in.close();

    }
}
