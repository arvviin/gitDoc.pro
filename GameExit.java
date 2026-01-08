import java.util.Scanner;

public class GameExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("you still play the game? ");
        String answer = sc.nextLine();
        if (!answer.equals("q") && !answer.equals("Q")) {
            System.out.println("your still playing the game *pew*pew");

        } else {
            System.out.println("you quit the game");
        }
    }
}