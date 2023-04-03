import java.util.Scanner;

public class Main {
    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }
        return current_gcd;
    }

    /**
     *
     * @param a - numerator
     * @param b - denominator
     * @return the greatest common divisor of a and b
     */
    private static int gcd_fast(int a, int b){
        // base case
        if(b == 0){
            return a;
        }
        // find the remainder and store it in a prime
        int a_prime = a % b;
        // recursive call
        return gcd_fast(b, a_prime);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd_fast(a, b));
    }
}