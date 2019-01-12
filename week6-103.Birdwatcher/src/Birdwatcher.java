
import java.util.Scanner;
import java.util.ArrayList;

public class Birdwatcher {

    private ArrayList<Bird> list = new ArrayList();

    public Birdwatcher() {

    }

    public void doSometing(Scanner reader) {

        while (true) {
            System.out.print("? ");
            String a = reader.nextLine();

            if (a.contains("Add")) {
                System.out.println("Name:");
                String b = reader.nextLine();

                System.out.println("Latin name:");
                String c = reader.nextLine();

                Bird bird = new Bird(b, c);
                list.add(bird);

                
               

            }
            if (a.equals("Observation")) {
                System.out.print("What was observed:? ");
                String c = reader.nextLine();
                for (Bird b : list) {
                    if (b.Name().equals(c)) {
                        b.observations();
                    } else {
                        System.out.println("Is not a bird!");
                    }

                }
            }

            if (a.equals("Quit")) {
                break;
            }

            if (a.equals("Show")) {
                System.out.print("What? ");
                String b = reader.nextLine();
                for (Bird c : list) {
                    if (c.Name().equals(b)) {
                        System.out.println(c.toString());
                    }
                }

            }
            if (a.equals("Statistics")) {

                for (Bird c : list) {

                    System.out.println(c.toString());
                }

            }

        }
    }

}
