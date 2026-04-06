import java.util.Scanner;

public class NumberChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return rev == n;
    }

    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n;

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, 3);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Prime: " + isPrime(n));
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Armstrong: " + isArmstrong(n));

        sc.close();
    }
}
