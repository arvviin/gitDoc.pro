public class ArraySmallestElement {

    public static void main(String[] args) {

        int[] arr = { 7, 3, 1, 4, 5 };
        int min = arr[0];// min = minimum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];

            }
            System.out.println(i + "value" + min + "minvalue");

        }
        System.out.println("smallest number is" + min);
    }

}
