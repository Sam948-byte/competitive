//use this bad boy when it times out
// program using BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bufferedReader {

    public static void bufferedReader()
            throws IOException {

        StringTokenizer st = new StringTokenizer(new BufferedReader(
                new InputStreamReader(System.in)).readLine());

    }
}