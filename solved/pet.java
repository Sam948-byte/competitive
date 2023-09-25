package solved;

import utils.FastReader;

public class pet {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int[][] scores = new int[5][4];

        int[] winner = {0, 0};

        int temp = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                scores[i][j] = in.nextInt();
            }
        }

        

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                temp += scores[i][j];
            }
            if(temp > winner[1]){
                winner[1] = temp;
                winner[0] = i + 1;
            }
            temp = 0;
        }

        System.out.print(winner[0] + " " + winner[1]);

    }
}