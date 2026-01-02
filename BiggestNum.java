import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 'A' : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 'B' : ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(" 'A' is the biggest num");
        } else if (b > a) {
            System.out.println(" 'B' is the biggest num");

        }
        sc.close();
    }
}
