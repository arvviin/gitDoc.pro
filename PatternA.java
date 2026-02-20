public class PatternA {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == i || i != 4 || j != 4) {
                    System.out.print(counter);

                }
            }
            System.out.println();
        }
    }
}