package solved;

import utils.FastReader;

public class sith{
public static void main(String[] args){
    FastReader in = new FastReader();

    in.nextLine();

    int a = in.nextInt();

    int b = in.nextInt();

    int answer = in.nextInt();

    int jedi = a - b;

    int sith = Math.abs(a - b);

    if(answer == jedi && answer == sith){
        System.out.print("VEIT EKKI");
    } else if(answer == jedi){
        System.out.print("JEDI");
    } else{
        System.out.print("SITH");
    }
}
}