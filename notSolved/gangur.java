package notSolved;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gangur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        in.close();

        List<Character> hallway = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        int left = 0;
        int right = 0;

        for(Character c : hallway){
            if(c == '<') left++;
            if(c == '>') right++;
        }

        System.out.println(left * right);
    }
}