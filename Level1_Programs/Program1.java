import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        double result = calculateSI(principal, rate, time);

        System.out.println("Simple Interest = " + result);

        sc.close();
    }
}
