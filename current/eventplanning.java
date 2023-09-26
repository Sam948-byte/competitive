import utils.FastReader;

public class eventplanning {
    class hotel{
        int cost;
        int beds;
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        int budget = in.nextInt();

        int h = in.nextInt();

        int weeks = in.nextInt();

        hotel[] hotels = new hotel[h];

        for(int i = 0; i < h; i++){
            hotels[i].cost = in.nextInt();
            for(int j = 0; j < weeks; j++){
                int mostBeds = in.nextInt();
            }
        }


    }
}
