import java.util.Scanner;

public class UsingScanner {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a roll number");
    int Roll = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter your name ?");
    String Name = sc.nextLine();

    System.out.println("Branch?");
    String Branch = sc.nextLine();

    System.out.println("Gender ");
    String Gender = sc.nextLine();

    sc.close();

    System.out
        .println(" Your " + Name + "  your are " + Gender + " your branch is " + Branch + " your roll num is  " + Roll);

  }
}
