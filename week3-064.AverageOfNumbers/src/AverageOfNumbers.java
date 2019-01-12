
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {

        int i = 0;
        int c = 0;

        while (list.size() > i) {

            int b = list.get(i);
            c = c + b;

            i++;
        }
        return c;

    }

    public static double average(ArrayList<Integer> list) {

        double b = list.size();
        double c = sum(list)/b;
        return c;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
