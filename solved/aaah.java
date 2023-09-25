package solved;
import utils.FastReader;

public class aaah {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        String able = in.nextLine();
        String doctor = in.nextLine();

        

        if (able.length() >= doctor.length()) {
            System.out.print("go");
        } else {
            System.out.print("no");
        }
    }
}
