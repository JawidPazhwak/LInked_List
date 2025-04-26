import java.util.Scanner;
public class MathUtilityTester {
    public static void main(String[] args) {
        MathUtility m1 = new MathUtility();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter your operation: ");
        String operation = sc.next();
        m1.operate(a, b, operation);

    }
}
