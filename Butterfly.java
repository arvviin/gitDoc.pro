public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // Star
        for (int i = 1; i <= n; i++) {
            // star- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // stars -2*(n-i)
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // star-1
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();

            // 2nd half

        }
        for (int i = n; i >= 1; i--) {

            // star- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // stars -2*(n-i)
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // star-1
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
