import java.util.Arrays;

public class Selectionsort {
    public static void basicsorting(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[minpos] > array[j]) {
                    minpos = j;
                }
            }
            // swapping
            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 6 };
        basicsorting(array);
        System.out.println(Arrays.toString(array));

    }
}
