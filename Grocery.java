
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prices");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float ballpen = sc.nextFloat();

        float total = (pen + pencil + ballpen);
        System.out.println("your cost is :" + total);

    }
}
