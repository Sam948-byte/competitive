package notSolved;

import java.util.Scanner;

public class ninetynine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;

        System.out.println(1);

        while(true){
            i = in.nextInt();
            if(i != 97){
                System.out.println(i + 1);
            } else{
                System.out.println(i + 2);
                break;
            }
            if(i == 98) break;
        }

        in.close();

    }
}
