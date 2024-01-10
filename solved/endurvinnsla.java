import utils.FastReader;

public class endurvinnsla {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        in.next();

        float percent = in.nextFloat();

        int n = in.nextInt();

        float nonPlastic = 0;

        for(int i = 0; i < n; i++){
            if(in.nextLine().matches("ekki plast")){
                nonPlastic++;
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
