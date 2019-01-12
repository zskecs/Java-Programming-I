
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private MyDate currentdate;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);

    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int age() {

        int a = Calendar.getInstance().get(Calendar.DATE);
        int b = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int c = Calendar.getInstance().get(Calendar.YEAR);

        this.currentdate = new MyDate(a, b, c);
        return this.currentdate.differneceInYears(birthday);
    }

    public boolean olderThan(Person compared) {

        if (this.birthday.earlier(compared.birthday)) {

            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
public Person(String name) {
    this.name = name;    
    
      int a = Calendar.getInstance().get(Calendar.DATE);
        int b = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int c = Calendar.getInstance().get(Calendar.YEAR);

        this.currentdate = new MyDate(a, b, c);

        this.birthday = currentdate;
}
}
