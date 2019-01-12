
import java.util.ArrayList;
import java.util.Iterator;


public class Phonebook {


    
       private ArrayList<Person> list;

    public Phonebook() {
        
        this.list = new ArrayList<Person>();
    }
       

   

    public void add(String name, String number) {
        Person person = new Person(name, number);

        list.add(person);

    }

    public void printAll() {
        for (Person b : list) {
            System.out.println(b);
        }

    }

    public String searchNumber(String name) {
        for (Person b : list) {
            if (name.equals(b.getName())) {
                return b.getNumber();
            }
        }
        return "number not known";
    }
}
