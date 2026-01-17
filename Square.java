import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of Square");
        int area = sc.nextInt();
        int total = area * area;
        System.out.println("Area of square :" + total);
    }
}
