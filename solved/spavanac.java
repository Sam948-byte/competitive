package solved;

import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hours = in.nextInt();

        int minutes = in.nextInt();

        in.close();

        minutes += hours * 60;

        minutes -= 45;

        if(minutes < 0){
            minutes = (24 * 60) + minutes;
        }

        System.out.print((int)(minutes/60) + " " + minutes % 60);
    }
}