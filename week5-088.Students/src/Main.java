
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();
        String name = ",";
        String studentnumber;
        String search;

        while (true) {
            System.out.print("name: ");

            name = reader.nextLine();
            if (!name.equals("")) {

                System.out.print("studentnumber: ");
                studentnumber = reader.nextLine();
                list.add(new Student(name, studentnumber));
            } else {
                break;
            }
        }

        for (Student prs : list) {
            System.out.println(prs);
        }
        
        System.out.println("Give search term: ");
        search = reader.nextLine();
        System.out.println("Result:");
        for (Student prs : list) {
             String index = prs.getName();
             int index2 = index.indexOf(search);
             
             if (index2> -1) {
                 System.out.println(prs.toString());
            
             }
        }
        
    
        System.out.println("Result: ");
       
    }
}
