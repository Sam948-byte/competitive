package solved;

import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int[] correct = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < 6; i++){
            System.out.print(correct[i] - in.nextInt() + " ");
        }

        in.close();

        
    }
}
