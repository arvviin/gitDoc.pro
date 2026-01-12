import java.util.Scanner;

public class SymbolsPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column;
        int rows;
        String Symbol = "";
        System.out.println("Enter number of rows ");
        rows = sc.nextInt();
        System.out.println("Enter number of column ");
        column = sc.nextInt();
        System.out.println("Enter your Symbol");
        Symbol = sc.next();

        for (int i = 0; i <= rows; i++) {
            System.out.println();
            for (int j = 0; j <= column; j++) {
                System.out.print(Symbol);
            }
        }
        sc.close();
    }

}