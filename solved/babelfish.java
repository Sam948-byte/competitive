package solved;

import java.util.HashMap;
import java.util.Map;

import utils.FastReader;

public class babelfish {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        Map<String, String> map = new HashMap<String, String>();
        String entry = in.next();
        String key = in.next();
        String line = entry + " " + key;

        do {
            map.put(line.split(" ")[1], line.split(" ")[0]);
        } while ((line = in.nextLine()).matches(".*[a-zA-Z]+.*"));

        String word;
        String element;

        do {
            word = in.next();
            element = map.get(word);
            System.out.println((element == null) ? "eh" : element);
        } while (in.hasNext());

    }
}
