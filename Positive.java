import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("this is the zero or default ");
        } else if (num > 0) {
            System.out.println("this is the positive number");
        } else {
            System.out.println("this is the negitive number");

        }
    }
}
