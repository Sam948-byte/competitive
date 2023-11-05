package notSolved;
import java.util.LinkedList;

import utils.FastReader;

public class rankproblem {
    class Node {
        int data;
        Node next;
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int games = in.nextInt();

        LinkedList<Integer> teams = new LinkedList();

        for (int i = 1; i <= n; i++) {
            teams.add(i);
        }

        for (int i = 0; i < games; i++) {
            int first = findLinkedList(teams, Integer.parseInt(in.next().substring(1, 2)));
            int second = findLinkedList(teams, Integer.parseInt(in.next().substring(1, 2)));

            if (first > second) {

                teams.add(first + 1, teams.get(second));
                teams.remove(second);
            }
        }

        for(int i = 0; i < teams.size(); i++){
            System.out.println("T" + teams.get(i));
        }
    }

    public static int findLinkedList(LinkedList ll, Object element) {
        for (int i = 0; i < ll.size(); i++) {
            Object llElement = ll.get(i);

            if (llElement == element) return i;
            
        }
        return -1;
    }
}
