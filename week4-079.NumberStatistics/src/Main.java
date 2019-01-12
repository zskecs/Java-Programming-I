
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        int input = 0;
        System.out.println("Type numbers:");
        while (input != -1) {
            stats.addNumber(input);

            input = reader.nextInt();
            
            
            if (input % 2 == 0) {
                even.addNumber(input);
            }

            if (input % 2 == 1) {
                odd.addNumber(input); 

            }
        }
                    
            System.out.println("sum: " + stats.sum());

            System.out.println("sum of even: " + even.sum());

            System.out.println("sum of odd: " + odd.sum());
        }
    }

