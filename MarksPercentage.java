
import java.util.Scanner;

public class MarkdPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Passed the exam");
            System.out.println(" A+ grade");

        } else if (marks >= 80) {
            System.out.println("Passed the exam");
            System.out.println(" A grade");
        } else if (marks > 70) {
            System.out.println("Passed the exam");
            System.out.println("B+ grade");
        } else if (marks > 60) {
            System.out.println("Passed the exam");
            System.out.println("B grade");
        } else if (marks > 50) {
            System.out.println("passed the exam");
            System.out.println("C+ grade");
        } else if (marks > 40) {
            System.out.println("Passed the exam");
            System.out.println("C grade");
        } else if (marks > 30) {
            System.out.println("just passed the exam");
            System.out.println("D grade");
        } else if (marks < 30) {
            System.out.println("failed the exam");
            System.out.println("E");

        }
        sc.close();

    }
}