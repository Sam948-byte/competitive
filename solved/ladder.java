package solved;


import utils.FastReader;
public class ladder {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int h = in.nextInt();
        int v = in.nextInt();

        
        
        double angle = Math.toRadians(v);
        double sin = Math.sin(angle);
        

        System.out.println((int)Math.ceil(h/sin));

    }
}
