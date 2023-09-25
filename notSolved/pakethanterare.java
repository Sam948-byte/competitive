package notSolved;

import java.util.Scanner;
import java.util.ArrayList;

public class pakethanterare{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int b = in.nextInt();

        ArrayList<String> packageNames = new ArrayList<>();

        ArrayList<Integer> packageVersions = new ArrayList<>();

        int[] stock = new int[b];

        int[] answers = new int[b];

        for(int i = 0; i < b; i++){
            stock[i] = in.nextInt();
        }

        for(int i = 0; i < t; i++){
            packageNames.add(in.next());
            packageVersions.add(in.nextInt());
        }

        for(int i = 0; i < b; i++){
            for(int j = 0; j < stock[i]; j++){
                answers[i] += packageVersions.get(packageNames.indexOf(in.next())) - in.nextInt();
            }
        }

        in.close();

        for(int i = 0; i < b; i++){
            System.out.println(answers[i]);
        }
    }
}