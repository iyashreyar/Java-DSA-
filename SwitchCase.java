import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand : ");
        int a = sc.nextInt();
        System.out.println("Enter second operand : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        String operation = sc.next();

        switch (operation) {

            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "*":
                System.out.println(a * b);
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Invalid Operation");
                } else {
                    System.out.println(a / b);
                }
                break;

            case "%":
                if (b == 0) {
                    System.out.println("Invalid Operation");
                } else {
                    System.out.println(a % b);
                }
                break;

            default:
                System.out.println("Invalid operation performed");
        }
    }
}
