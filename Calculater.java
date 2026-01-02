
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operation(+,*,-,/,): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("cannot divide by 0");
                break;
            default:
                System.out.println("invalid operation");
                sc.close();
        }

    }

}
