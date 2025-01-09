import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num1: ");
        double num1 = scanner.nextDouble();

        System.out.print("num2: ");
        double num2 = scanner.nextDouble();

        System.out.print("oper (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println("결과: " + result);
    }
}
