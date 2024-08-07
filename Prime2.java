import java.util.*;
import java.math.*;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Prime(n)) {
            System.out.println(n + "is prime");

        } else {
            System.out.println(n + "is not prime");
        }

    }

    static boolean Prime(int n) {
        if (n == 1 || n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

}
