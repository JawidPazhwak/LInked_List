public class MathUtility {
    public double a;
    public double b;

    public static void Add(double a, double b){
        System.out.println("Addition: " + (a + b));
    }
    public static void Subtract(double a, double b){
        System.out.println("Subtraction: " + (a - b));
    }
    public static void Multiply(double a, double b){
        System.out.println("Multiplication: " + (a * b));
    }
    public static void Division(double a, double b){
        System.out.println("Division: " + (a / b));
    }
    public void operate(double a, double b, String o){
        switch (o) {
            case "+":
                Add(a, b);
                break;
            case "-":
                Subtract(a, b);
                break;
            case "*":
                Multiply(a, b);
                break;
            case "/":
                Division(a, b);
                break;
            default:
                System.out.println("Can not do operation");
                break;
        }
    }
}
