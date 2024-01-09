
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        List<Character> strII = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        
        for(int i = strII.size() - 1; i > -1; i--){
            System.out.print(strII.get(i));
        }

    }
}
