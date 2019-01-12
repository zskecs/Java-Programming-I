
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];

            }
        }

        return s;
    }

    public static int indexOfTheSmallest(int[] array) {
        int s = array[0];
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                d = i;

            }
        }

        return d;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int s = array[index];
        int d = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                d = i;

            }
        }

        return d;
    }

    public static void swap(int[] array, int index1, int index2) {

        int a = index1;
        int b = index2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[a]) {
                int c = array[i];
                array[i] = array[b];

                array[b] = c;
            }
        }

    }

    public static void sort(int[] array) {
         System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            
            int a = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, a);
            System.out.println(Arrays.toString(array));

        }
    }
}
