package notSolved;


import utils.FastReader;

public class bizzFuzz {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        long count = 0;

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        
        long difference = b - a;

        // long increment = Math.max(c, d);

        long increment = lcm(c, d);

        long fixer = a % increment;

        long check = difference + fixer;

        // long startNumber = a;

        // while (startNumber % increment != 0) {
        // startNumber++;
        // }

        // for (long i = startNumber; i <= b; i += increment) {
        // if (i % c == 0) {
        // if (i % d == 0) {
        // count++;
        // }
        // }
        // }

        // for (long i = startNumber; i <= b; i += increment) {
        // if (i % increment == 0) {
        // count++;
        // }
        // }

        count = (long) check / increment;

        System.out.print(count);
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    

}
