import java.util.Arrays;

public class Bubblesort {
    public static void basicsorting(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) { // outer loops runs n times

            for (int j = 0; j < arr.length - 1 - i; j++) {// inner loops runs n-1 times
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];// temp = array 'j'
                    arr[j] = arr[j + 1];// j = i
                    arr[j + 1] = temp; // i = temp("where 'j' is stored as temp")
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6 };
        basicsorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
