package notSolved;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

import utils.FastReader;

class Hotel {
    Integer cost;
    Integer beds;

    Hotel(Integer cost, Integer beds) {
        this.cost = cost;
        this.beds = beds;
    }

    Integer getCost() {
        return cost;
    }
}

public class eventplanning {

    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int budget = in.nextInt();

        int h = in.nextInt();

        int weeks = in.nextInt();

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();

        for (int i = 0; i < h; i++) {
            hotels.add(new Hotel(in.nextInt(), greatest(weeks, in, n)));
        }

        hotels.sort((o1, o2) -> o1.getCost().compareTo(o2.getCost()));

        int hotelIndex = -1;

        for (int i = 0; i < h; i++) {
           if(hotels.get(i).beds >= n){
            hotelIndex = i;
            break;
           }
        }

        int totalCost = hotels.get(hotelIndex).cost * n;

        if(hotelIndex == -1 || totalCost > budget) System.out.print("stay home");
         else System.out.print(hotels.get(hotelIndex).cost * n);

    }

    public static int greatest(int num, FastReader in, int limit) {
        int greatest = in.nextInt();
        int current;
        for(int i = 0; i < num - 1; i++){

            if ((current = in.nextInt()) < greatest && current >= limit){
                greatest = current;
            }
        }

        return greatest;
    }
}
