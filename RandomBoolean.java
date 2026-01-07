import java.util.Random;

public class RandomBoolean {
    public static void main(String[] args) {
        Random bool = new Random();
        boolean randomBoolean = bool.nextBoolean();
        System.out.println("your random boolean is: " + randomBoolean);
    }
}
