
import java.util.Scanner;

public class Grade {

    private String grade0 = "";
    private String grade1 = "";
    private String grade2 = "";
    private String grade3 = "";
    private String grade4 = "";
    private String grade5 = "";

    int sum;

    public Grade() {

        int sum = 0;
    }

    public void doSomething(Scanner reader) {
        while (true) {
            int a = Integer.parseInt(reader.nextLine());
            if (a == -1) {
                break;
            } else if (a >= 0 && a <= 29) {
                grade0 += "*";

            } else if (a >= 30 && a <= 34) {
                grade1 += "*";

            } else if (a >= 35 && a <= 39) {
                grade2 += "*";

            } else if (a >= 40 && a <= 44) {
                grade3 += "*";

            } else if (a >= 45 && a <= 49) {
                grade4 += "*";

            } else if (a >= 50 && a <= 60) {
                grade5 += "*";

            }
        }
    }

    public void printStars() {
        System.out.println("Grade distribution:");
        System.out.println("");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);

        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
        System.out.println("");
        
        
    }

    public void sum2() {
        //Calculate acceptance rate
        sum = grade1.length() + grade2.length()
                + grade3.length() + grade4.length()
                + grade5.length() + grade0.length();
      
    }

    
    public void printAcceptance() {
        this.sum2();
        double acrate;
        if (sum == 0) {
            acrate = 0.0;
        } else {
            acrate = (sum - grade0.length()) * 100 / sum;
        }
        System.out.println("Acceptance percentage: " + acrate);
    }
}
