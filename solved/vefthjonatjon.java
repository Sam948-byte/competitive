package solved;

import utils.FastReader;

public class vefthjonatjon {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        boolean[][] parts = new boolean[3][n];

        boolean set;

        for (int i = 0; i < n * 3; i++) {
            if (in.next().equals("J")) {
                set = true;
            } else {
                set = false;
            }

            parts[i % 3][(int) i / 3] = set;

        }

        

        int cpu = number(parts[0]);
        int memory = number(parts[1]);
        int drive = number(parts[2]);

        System.out.print(Math.min(cpu, Math.min(memory, drive)));

        
    }

    public static int number(boolean[] arr){
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                num++;
            }
        }

        return num;
    }
}
