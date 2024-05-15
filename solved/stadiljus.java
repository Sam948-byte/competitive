import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import utils.FastReader;

public class stadiljus {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int cost = in.nextInt();

        int y = in.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }

        list.sort(null);

        int returnValue = n;

        double total = 0;

        for(int i = 1; i <= list.size(); i++) {
            int individualCost = list.get(i - 1) * cost;

            total += individualCost;
            //may need to use a double here
            if(total / i > y) {
                returnValue = i - 1;
                break;
            }
        }

        System.out.println(returnValue);
    }
}