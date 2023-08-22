package solved;


import java.util.Scanner;
public class ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int v = in.nextInt();

        in.close();
        
        double angle = Math.toRadians(v);
        double sin = Math.sin(angle);
        

        System.out.println((int)Math.ceil(h/sin));

    }
}
