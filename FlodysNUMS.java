
public class FlodysNUMS {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            // inner loop counter will decide how many nums should print in a loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
