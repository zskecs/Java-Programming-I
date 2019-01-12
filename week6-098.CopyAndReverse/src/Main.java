
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {

        int[] copied = array.clone();

        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            reverse[i] = array[array.length -1- i];
        }
        return reverse;
    }
}
