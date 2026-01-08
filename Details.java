import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name?");
        name = sc.next();
        System.out.println("your name : " + name);

        String Email;
        System.out.println("Enter your email:");
        Email = sc.next();
        System.out.println("your Email :" + Email);

        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        System.out.println("your number :" + number);

        int pincode;
        System.out.println("Enter your pincode");
        pincode = sc.nextInt();
        System.out.println(" your pincode : " + pincode);

        String state;
        System.out.println("Enter the State");
        state = sc.next();
        System.out.println("your State :" + state);

        String gender;
        System.out.println("Enter your gender");
        gender = sc.next();
        System.out.println("Your gender : " + gender);

        sc.close();
    }
}
