//TODO
import java.util.Scanner;

public class keylogger(){
String[][] noises = new String{{clank, 65}, {bong, 66}, {click, 67}, {tap, 68}, {poing, 69}, {clonk, 70}, {clack, 71}, {ping, 72}, {tip, 73}, {cloing, 74}, {tic, 75}, {cling, 76}, {bing, 77}, {pong, 78}, {clang, 79}, {pang, 80}, {clong, 81}, {tac, 82}, {boing, 83}, {boink, 84}, {cloink, 85}, {rattle, 86}, {clock, 87}, {toc, 88}, {clink, 89}, {tuc, 90}}

    public static void main(){
        Scanner in = new Scanner(System.in);
        boolean shifted = false;
        String print = new String();

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String sound = in.nextLine();
            
            if(Object.equals(sound, "whack")){
                print += " ";
                continue;
            }

if(Object.equals(sound, "pop")){
    print = print.substring(0, str.length()-1);
}

            if(Object.equals(sound, "bump") || Object.equals(sound, "dink") || Object.equals(sound, "thumb")){
                shifted = !shifted;
                continue;
            }

            for(int j = 0; j < noises.length(); j++){
                if(Object.equals(noises[0][j], sound)){
                    int number = noises[1][j];
                    break;
                }
            }

            if(!shifted){
                print += (char) number + 32;
            }else{
                print += (char) number;
            }
        }
    }
}