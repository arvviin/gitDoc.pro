import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        // finding biggest of two nums

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 'A' : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 'B' : ");
        int b = sc.nextInt();
        // by if & if else we find which is the biggest num
        if (a > b) {
            System.out.println(" 'A' is the biggest num");
        } else if (b > a) {
            System.out.println(" 'B' is the biggest num");

        }
        // closong scanner is important otherwise it flows
        sc.close();
    }
}
