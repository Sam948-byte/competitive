
//too slow
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import utils.FastReader;

public class gangur {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String str = in.next();

        List<Character> hallway = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        int passes = 0;

        int i;

        
        while((i = hallway.indexOf('>')) != -1){
        hallway.set(i, '-');
        passes += Collections.frequency(hallway.subList(i, hallway.size()), '<');
        }

        System.out.println(passes);

    }

}