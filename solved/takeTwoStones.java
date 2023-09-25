package solved;
import utils.FastReader;

public class takeTwoStones {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int input = in.nextInt();

        

        if(input % 2 == 0){
            System.out.print("Bob");
        }else{
            System.out.print("Alice");
        }
    }
}
