
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        Double Radius = sc.nextDouble();
        double area = Math.PI * Radius * Radius;
        System.out.println("Area of circle=" + area);
        sc.close();
    }
}
