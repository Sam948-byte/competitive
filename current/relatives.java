package current;

import java.util.ArrayList;
import java.util.Scanner;

public class relatives{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n;

        ArrayList<Integer> counts = new ArrayList<Integer>();

        while((n = in.nextLong()) != 0){
            int count = 0;

            for(long i = n; i > 2; i += smallestDivisor(n)){
                if(GCD(i, n) == 1) count++;
            }

            counts.add(count);
        }

        in.close();

        for(int i = 0; i < counts.size(); i++){
            System.out.println(counts.get(i));
        }

    }

    public static long GCD(long a, long b){

        if(b == 0) return a;
        return GCD(b, a % b);
    }

    public static long smallestDivisor(long a){
        if(a % 2 == 0) return 2;

        for(int i = 3; i <= a; i += 2){
            if(a % i == 0) return i;
        }

        return a;
    }
}