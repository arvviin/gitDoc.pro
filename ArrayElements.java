public class ArrayElements {
    public static void main(String[] args) {
        // finding the biggest value amonge this arrays
        int[] arr = { 10, 20, 30 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {// larr.length is used to
                                              // calculate the highest value
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("biggest element is" + max);
    }
}
