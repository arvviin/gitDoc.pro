public class MethodOverLoading {

    public static void main(String[] args) {

        double x = div(6, 7);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("this is your addition num");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("this is your addition num");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("this is your addition num");
        return a + b + c + d;
    }

    static int sub(int a, int b) {
        System.out.println("this is your subtraction num");
        return a - b;
    }

    static int sub(int a, int b, int c) {
        System.out.println("this is your subtraction num");
        return a - b - c;
    }

    static double div(double a, double b) {
        System.out.println("this is your divison num");
        return a % b;
    }
}
