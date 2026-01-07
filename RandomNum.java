import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Random num = new Random();
        int randomNum = num.nextInt(100) + 1;
        System.out.println("your random number is: " + randomNum);
    }
}