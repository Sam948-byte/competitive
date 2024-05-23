
import java.util.Arrays;
import java.util.Collections;
import utils.FastReader;

public class pizzubestun {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        Integer[] costs = new Integer[n];

        for(int i = 0; i < n; i++){
            in.next();

            costs[i] = in.nextInt();
        }

        

        Integer cost = 0;

        Arrays.sort(costs, Collections.reverseOrder());


        
        n = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for(int i = 0; i < n; i++){
            cost += costs[i];
        }

        System.out.print(cost);

       
    }
}
