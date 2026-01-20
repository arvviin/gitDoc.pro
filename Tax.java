import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        int tax;
        if (salary < 50000) {

            tax = 0;
        } else if (salary >= 500000 && salary <= 1000000) {
            tax = (int) (salary * 0.2);
        } else {
            tax = (int) (salary * 0.35);
        }
        System.out.println("your tax to paid:" + tax);
        sc.close();
    }
}