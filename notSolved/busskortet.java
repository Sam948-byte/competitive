package notSolved;
import utils.FastReader;

public class busskortet {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int k = in.nextInt();

        int transactions = 0;

        while(k > 500){
            k -= 500;
            transactions++;
        }
        
        if(k > 400){
            k -= 500;
            transactions++;
        } 

        if(k > 200) transactions ++;

        while(k > 200){
            k -= 200;
            transactions++;
        }

        

       System.out.print(transactions);
    }
}
