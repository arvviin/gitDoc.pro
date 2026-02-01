public class Ternary {
    public static void main(String[] args) {
        /*
         * Syntax of ternary operator
         * Variable =Condition?Statement:Statement2;
         */

        int Exammarks = 50;
        String marks = (Exammarks >= 35) ? "pass" : "fail";
        System.out.println(marks);
    }
}
