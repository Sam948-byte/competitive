package current;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class babelfish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> plaintext = new ArrayList<String>();

        List<String> cipher = new ArrayList<String>();

        List<String> coded = new ArrayList<String>();

        String[] arr = new String[2];

        boolean which = true;

        String line;

        while ((line = in.nextLine()).matches(".*[a-zA-Z]+.*")) {

            arr = line.split(" ");
            plaintext.add(arr[0]);
            cipher.add(arr[1]);

        }

        while ((line = in.nextLine()).matches(".*[a-zA-Z]+.*")) {

            coded.add(line);

        }

        in.close();

        int index;

        for (int i = 0; i < coded.size(); i++) {
            index = cipher.indexOf(coded.get(i));
            if (index == -1) {
                System.out.println("eh");
            } else {
                System.out.println(plaintext.get(index));
            }
        }

    }
}
