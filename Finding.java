package gitDoc.pro;

import java.util.Scanner;

public class Finding {
    public static void main(String[] args) {
        int x;
        int y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side number: ");
        x = scanner.nextInt();
        System.out.println("Enter the second side number: ");
        y = scanner.nextInt();
        z = Math.sqrt(x * x) + (y * y);
        System.out.println("The hypotenuse is: " + z);
        scanner.close();
    }

}
