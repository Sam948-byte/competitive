package solved;

import utils.FastReader;

public class trik {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        boolean[] place = {true, false, false};

        String input = in.nextLine();

        

        for(int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            boolean temp;

            if(letter == 'A'){
                temp = place[0];
                place[0] = place[1];
                place[1] = temp;
                
            } else if(letter == 'B'){
                temp = place[1];
                place[1] = place[2];
                place[2] = temp;
                
            } else if(letter == 'C'){
                temp = place[0];
                place[0] = place[2];
                place[2] = temp;
                
            }
          
            
        }

        if(place[0]){
            System.out.print("1");
        } else if(place[1]){
            System.out.print("2");
        } else if(place[2]){
            System.out.print("3");
        }
    }
}
