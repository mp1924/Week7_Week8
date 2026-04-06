import java.util.Scanner;

public class RecursiveSum {

    public static int recursive(int n) {
        if (n == 1) return 1;
        return n + recursive(n - 1);
    }

    public static int formula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Recursive = " + recursive(n));
        System.out.println("Formula = " + formula(n));

        sc.close();
    }
}
