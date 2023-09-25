package solved;
import java.util.ArrayList;
import java.util.List;
import utils.FastReader;

public class everywhere {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int t = in.nextInt();

        int[] cases = new int[t];

        String[][] cities = new String[t][];

        for(int i = 0; i < t; i++){
            cases[i] = in.nextInt();
            cities[i] = new String[cases[i]];
            for(int j = 0; j < cases[i]; j++){
                cities[i][j] = in.next();
            }
        }

        

        List<String> distinctChecker = new ArrayList<String>();

        for(int i = 0; i < t; i++){
            int distinct = 0;
            for(int j = 0; j < cases[i]; j++){
                if(!distinctChecker.contains(cities[i][j])){
                    distinctChecker.add(cities[i][j]);
                    distinct++;
                }
            }
            System.out.println(distinct);
        }
    }
}
