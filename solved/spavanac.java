package solved;

import utils.FastReader;

public class spavanac {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int hours = in.nextInt();

        int minutes = in.nextInt();

        

        minutes += hours * 60;

        minutes -= 45;

        if(minutes < 0){
            minutes = (24 * 60) + minutes;
        }

        System.out.print((int)(minutes/60) + " " + minutes % 60);
    }
}