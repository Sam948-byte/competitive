package notSolved;
import java.util.ArrayList;

import utils.FastReader;

public interface dutub {
    public class Video {
        int length;
        char[] category;

        Video(int length, char[] category) {
            this.length = length;
            this.category = category;
        }

    }

    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        Video[] videos = new Video[n];

        ArrayList<Character> categories = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int len = in.nextInt();
            char[] cats = in.next().toCharArray();

            for (char cat : cats) {
                if (categories.contains(cat)) categories.add(cat);
            }

            videos[i] = new Video(len, cats);
        }

        

    }
}
