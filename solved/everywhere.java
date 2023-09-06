package solved;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class everywhere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        in.close();

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
