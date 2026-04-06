import java.util.Scanner;

public class NumberType {

    public static int check(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = check(num);

        if (result == 1) System.out.println("Positive");
        else if (result == -1) System.out.println("Negative");
        else System.out.println("Zero");

        sc.close();
    }
}
