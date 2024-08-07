import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n == 1 || n == 0) {
            System.out.println(n + "is the not prime");

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + "is the not prime");
                flag = 1;
                break;

            }
        }

        if (flag == 0) {
            System.out.println(n + "is prime");
        }

    }

}
