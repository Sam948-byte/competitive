
import java.util.ArrayList;
import java.util.LinkedList;

import utils.FastReader;

public class ninetynineproblems2 {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int q = in.nextInt();

        ArrayList<Integer> difficulties = new ArrayList<>();

        LinkedList<Object[]> list = new LinkedList<Object[]>();

        for (int i = 0; i < n; i++) {
            difficulties.add(in.nextInt());
        }

        for (int i = 0; i < q; i++) {
            list.add(new Object[] { (in.nextInt() == 1) ? true : false, in.nextInt() });
        }

        for (Object[] obj : list) {
            int out = -1;
            if ((boolean) obj[0]) {
                for (int i = 0; i < difficulties.size(); i++) {
                    if (difficulties.get(i) > (int) obj[1]) {
                       out = difficulties.get(i);
                        difficulties.remove(i);
                        break;
                    }
                    
                }
            } else if (!(boolean) obj[0]) {
                for (int i = 0; i < difficulties.size(); i++) {
                    if (difficulties.get(i) <= (int) obj[1]) {
                        out = difficulties.get(i);
                        difficulties.remove(i);
                        break;
                    }
                
                }
            }
         System.out.println(out);   
        }

    }
}