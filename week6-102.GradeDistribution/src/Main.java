
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type exam scores, -1 completes: ");
       
        Scanner reader = new Scanner(System.in);
        Grade grade = new Grade();

       grade.doSomething(reader);
       grade.printStars();
       grade.printAcceptance();
    }

}
