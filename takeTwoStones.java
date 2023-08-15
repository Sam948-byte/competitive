import java.util.Scanner;

public class takeTwoStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        if(input % 2 == 0){
            System.out.print("Bob");
        }else{
            System.out.print("Alice");
        }
    }
}
