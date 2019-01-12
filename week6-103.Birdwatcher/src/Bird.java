
import java.util.ArrayList;

public class Bird {

    private String name;
    private String latin;
    private int observations;

    public Bird(String Name, String Latin) {
        name = Name;
        latin = Latin;
        observations = 0;
    }

    public String Name() {

        return this.name;

    }

  
    public void observations() {

        this.observations++;

    }

    public String toString() {

        return name + " (" + latin + "): "+observations+" obsevations";

    }

}
