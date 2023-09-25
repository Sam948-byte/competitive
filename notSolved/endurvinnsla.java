package notSolved;

import utils.FastReader;

public class endurvinnsla {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String name = in.next();

        float percent = in.nextFloat();

        int n = in.nextInt();

        int plastic = 0;
        int nonPlastic = 0;

        for(int i = 0; i < n; i++){
            if(in.next().matches("ekki")){
                nonPlastic++;
            }else{
                plastic++;
            }
        }

        

        float ratio = nonPlastic / n;

        if(ratio > percent){
            System.out.print("Neibb");
        }else{
            System.out.print("Jebb");
        }
    }
}
