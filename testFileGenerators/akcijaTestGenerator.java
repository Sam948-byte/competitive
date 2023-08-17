
package testFileGenerators;

import java.io.*;
import java.util.Random;

public class akcijaTestGenerator {
  public static void main(String[] args) {
    int amount = 100000;

    Random ran = new Random();

    int number;

    try (PrintWriter file = new PrintWriter(
        new BufferedWriter(
            new FileWriter("/workspace/competitive/testFiles/akcijaTest.txt")));) {

      for (int i = 1; i <= amount; i++) {
        number = ran.nextInt(100000) + 1;
        file.println(number);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}