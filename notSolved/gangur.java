import utils.FastReader;

public class gangur {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String str = in.next();

        
        long right = 0;
        long total = 0;

        for(Character c : str.toCharArray()){
            if(c == '>') right++;
            if(c == '<') total += right;
        }

        System.out.println(total);

    }

}