package utils;

public class randomNumber {
    public static int randomNumber(int max, int min) {

        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;

        return rand;

    }
}