package solved;
import utils.FastReader;

public class heimavinna {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String[] problems = in.next().split(";");

        int total = 0;

        for(String i : problems){
            if(i.contains("-")){
                String[] range = i.split("-");
                total += Integer.parseInt(range[1]) - Integer.parseInt(range[0]) + 1;
            }else{
                total++;
            }
        }

        System.out.print(total);
    }   
}
