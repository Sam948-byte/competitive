import java.util.LinkedList;
import java.util.Scanner;

public class rankproblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<Integer> teams = new LinkedList<Integer>();

        int numTeams = in.nextInt();
        int numMatches = in.nextInt();

        for(int i = 1; i <= numTeams; i++){
            teams.add(i);
        }

        Match[] matches = new Match[numMatches];

        
    }

    public class Match{
        int winner;
        int loser;

        public void match(int winner, int loser){
            this.winner = winner;
            this.loser = loser;
        }
    }

}