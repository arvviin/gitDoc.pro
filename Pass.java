import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        int marks;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the student: ");

        marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("student pass : " + marks);
        }

        else
            System.out.println("student failed :" + marks);

        sc.close();
    }

}
