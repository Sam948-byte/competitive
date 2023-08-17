package testFileGenerators;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class akcijaTestGenerator {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("akcijaTest.txt");
      myWriter.write(Integer.parseInt(args[0]));
      for(int i = 0; i < Integer.parseInt(args[0]); i++){
        
      }
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}