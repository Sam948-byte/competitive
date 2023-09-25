package solved;

import utils.FastReader;

public class mylla2 {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String[][] grid = new String[3][3];

       for(int i = 0; i < 3; i++){
            grid[i] = in.next().split("");
       }

        

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (grid[0][i].equals("O") && grid[1][i].equals("O") && grid[2][i].equals("O")) {
                System.out.print("Jebb");
                found = true;
                break;
            }
            if (grid[i][0].equals("O") && grid[i][1].equals("O") && grid[i][2].equals("O")) {
                System.out.print("Jebb");
                found = true;
                break;
            }
        }

        if(!found && grid[1][1].equals("O")){
            if(grid[0][0].equals("O") && grid[2][2].equals("O")){
                System.out.print("Jebb");
                found = true;
            }
            if(grid[0][2].equals("O") && grid[2][0].equals("O")){
                System.out.print("Jebb");
                found = true;
            }
        } 

        if(!found) System.out.print("Neibb");
    }
}
