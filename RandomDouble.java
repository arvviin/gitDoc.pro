import java.util.Random;

public class RandomDouble {
    public static void main(String[] args) {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        System.out.println("your random double is: " + randomDouble);
    }

}
